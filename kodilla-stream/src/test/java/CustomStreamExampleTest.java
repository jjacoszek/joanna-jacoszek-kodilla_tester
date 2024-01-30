import com.kodilla.stream.CustomStreamExample;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomStreamExampleTest {

    @Test
    public void testSquareAndSum() {
        // Arrange
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Act
        int result = CustomStreamExample.squareAndSum(numbers);

        // Assert
        assertEquals(55, result);
    }

    @Test
    public void testSquareAndSumWithNegativeNumbers() {
        // Arrange
        List<Integer> numbers = List.of(-1, 2, -3, 4, 5);

        // Act
        int result = CustomStreamExample.squareAndSum(numbers);

        // Assert
        assertEquals(45, result);
    }

    @Test
    public void testSquareAndSumWithEmptyList() {
        // Arrange
        List<Integer> emptyList = List.of();

        // Act
        int result = CustomStreamExample.squareAndSum(emptyList);

        // Assert
        assertEquals(0, result);
    }

}
