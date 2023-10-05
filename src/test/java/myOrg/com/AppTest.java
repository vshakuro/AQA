package myOrg.com;

import org.junit.jupiter.api.*;
import static myOrg.com.App.factorial;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void PositiveNumber() {
        int number = 5;
        int expected = 120;
        int actual = factorial(number);
        assertEquals(expected, actual);
    }
    @Test
    public void Zero() {
        int number = 0;
        int expected = 1;
        int actual = factorial(number);
        assertEquals(expected, actual);
    }
    @Test
    public void One() {
        int number = 1;
        int expected = 1;
        int actual = factorial(number);
        assertEquals(expected, actual);
    }
    @Test
    public void NegativeNumber() {
        int number = -5;
        Throwable exception =
                assertThrows(IllegalArgumentException.class, ()
                        -> {
                    factorial(number);
                    throw new IllegalArgumentException("Отрицательное число");
                });
        assertEquals(exception.getMessage(), "Отрицательное число");
    }
}