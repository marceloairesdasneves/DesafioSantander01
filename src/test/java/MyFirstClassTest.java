import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// @author Marcelo Neves

public class MyFirstClassTest {

    @Test
    void testSumPositiveNumbers() {
        // Arrange
        int number1 = 10;
        int number2 = 0;

        // Act
        int result = MyFirstClass.sum(number1, number2);

        // Assert
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    void testSumNegativeNumbers() {
        int result = MyFirstClass.sum(-5, -3);
        assertEquals(-8, result, "(-5) + (-3) should equal -8");
    }

    @Test
    void testSumWithZero() {
        int result = MyFirstClass.sum(10, 0);
        assertEquals(10, result, "10 + 0 should equal 10");
    }

    @Test
    void testSumMixedNumbers() {
        int result = MyFirstClass.sum(-5, 5);
        assertEquals(0, result, "(-5) + 5 should equal 0");
    }

    @Test
    void testSumLargeNumbers() {
        int result = MyFirstClass.sum(1000000, 2000000);
        assertEquals(3000000, result);
    }
}

