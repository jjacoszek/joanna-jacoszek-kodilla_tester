import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;*/

public class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {
        // Arrange
        List<String> expectedUserName = List.of("Walter White","Gale Boetticher" );

        // Act
        List<String> resultUsernames = UsersManager.filterChemistGroupUsernames();

        // Assert
        assertEquals(expectedUserName, resultUsernames);
    }

    @Test
    public void testGetUserName() {
        // Arrange
        User user = new User("JohnDoe", 21, 7, "Chemists");

        // Act
        String username = UsersManager.getUserName(user);

        // Assert
        assertEquals("JohnDoe", username);
    }
}

