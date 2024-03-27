package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractMap;
import java.util.List;

class DbManagerTestSuite {

    private DbManager dbManager;
    private Connection connection;

    @BeforeEach
    public void setUp() throws SQLException {
        dbManager = DbManager.getInstance();
        connection = dbManager.getConnection();
    }
    @Test
    void testConnect() {
        //Given
        //When
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getResultsCount(rs);
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
            new AbstractMap.SimpleEntry<>("Otman", "Use"),
            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
    );

    private void insertUsers(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
            statement.executeUpdate(
                    String.format("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('%s', '%s')",
                            user.getKey(),
                            user.getValue()
                    )
            );
        }
    }

    private static int getResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while (rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }

    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }

    private void prepareTestData() throws SQLException {
        // Dodajemy testowe dane użytkowników i postów
        try (Statement statement = connection.createStatement()) {
            // Dodajemy użytkowników
            statement.executeUpdate("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('John', 'Doe')");
            statement.executeUpdate("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Jane', 'Smith')");
            // Dodajemy posty
            statement.executeUpdate("INSERT INTO POSTS(USER_ID, CONTENT) VALUES (1, 'Post 1')");
            statement.executeUpdate("INSERT INTO POSTS(USER_ID, CONTENT) VALUES (1, 'Post 2')");
            statement.executeUpdate("INSERT INTO POSTS(USER_ID, CONTENT) VALUES (2, 'Post 3')");
        }
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        // Given - testowe dane zostały już przygotowane w metodzie setUp()

        // When
        String sqlQuery = "SELECT u.FIRSTNAME, u.LASTNAME " +
                "FROM USERS u " +
                "JOIN POSTS p ON u.ID = p.USER_ID " +
                "GROUP BY u.ID " +
                "HAVING COUNT(p.ID) >= 2";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        // Then
        int count = 0;
        while (rs.next()) {
            System.out.printf("%s %s%n", rs.getString("FIRSTNAME"), rs.getString("LASTNAME"));
            count++;
        }

        // Assertion
        int expectedCount = 1;
        Assertions.assertEquals(expectedCount, count);

        rs.close();
        statement.close();
    }
}
