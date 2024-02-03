package com.kodilla.optional.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static double averagePostsForUsersOver40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static double averagePostsForUsersUnder40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        double averagePostsOver40 = averagePostsForUsersOver40(users);
        System.out.println("Średnia liczba postów dla użytkowników w wieku >= 40: " + averagePostsOver40);

        double averagePostsUnder40 = averagePostsForUsersUnder40(users);
        System.out.println("Średnia liczba postów dla użytkowników w wieku < 40: " + averagePostsUnder40);
    }
}
