package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGame {
    private int number;
    private String result;

    @Given("The number is {int}")
    public void theNumberIs(int number) {
        this.number = number;
    }

    @When("The FizzBuzz game is played with this number")
    public void theFizzBuzzGameIsPlayedWithThisNumber() {
        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = "None";
        }
    }

    @Then("Return {string}")
    public void returnResult(String expectedResult) {
        assertEquals(expectedResult, result);
    }
}
