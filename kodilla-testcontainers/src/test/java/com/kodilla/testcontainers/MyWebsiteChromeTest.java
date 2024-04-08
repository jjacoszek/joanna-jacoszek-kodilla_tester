package com.kodilla.testcontainers;


import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.DefaultRecordingFileFactory;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;

    public class MyWebsiteChromeTest {

        @Rule
        public Network network = Network.newNetwork();

        @Rule
        public GenericContainer webServer =
                new GenericContainer(
                        new ImageFromDockerfile()
                                .withFileFromClasspath("/tmp/index.html", "index.html")
                                .withDockerfileFromBuilder(builder ->
                                        builder
                                                .from("httpd:2.4")
                                                .copy("/tmp/index.html", "/usr/local/apache2/htdocs")
                                                .build()))
                        .withNetwork(network)
                        .withNetworkAliases("my-server")
                        .withExposedPorts(80);

        @Rule
        public BrowserWebDriverContainer chrome =
                new BrowserWebDriverContainer<>()
                        .withCapabilities(new ChromeOptions())
                        .withRecordingMode(RECORD_ALL, new File("./build/"))
                        .withRecordingFileFactory(new DefaultRecordingFileFactory())
                        .withNetwork(network);

        private RemoteWebDriver driver;

        @Before
        public void setUp() {
            driver = chrome.getWebDriver();
        }

        @Test
        public void testOpenPageWithChrome() throws IOException {
            String serverAddress = "http://" + webServer.getContainerIpAddress() + ":" + webServer.getMappedPort(80) + "/";
            driver.get(serverAddress);

            String pageTitle = driver.getTitle();
            assertEquals("Wizytówka", pageTitle);


            File screenshot = driver.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("./build/screenshots/chrome_screenshot.png"));
        }

        @After
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }

