package com.kodilla.optional.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {
    @Test
    void shouldCalculateAveragePostsForUsersOver40() {
        // given
        List<User> users = createTestUsers();

        // when
        double result = ForumStats.averagePostsForUsersOver40(users);

        // then
        assertEquals(3.0, result, 0.001); // oczekujemy średniej 3.0 na podstawie testowych danych
    }

    @Test
    void shouldCalculateAveragePostsForUsersUnder40() {
        // given
        List<User> users = createTestUsers();

        // when
        double result = ForumStats.averagePostsForUsersUnder40(users);

        // then
        assertEquals(4648.0, result, 0.001); // oczekujemy średniej 4648.0 na podstawie testowych danych
    }

    private List<User> createTestUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        return users;
    }
}