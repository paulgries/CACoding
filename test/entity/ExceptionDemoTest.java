package entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Calculator {
    public void divide(int i, int j) {
        int result = i / j;
    }
}
class ExceptionDemoTest {
    @Test
    void exceptionTest() {
        Calculator calculator = new Calculator();
        // Assert that the calculator.divide call throws an exception
        Exception exception = assertThrows(
                ArithmeticException.class,
                // This is an anonymous method that gets called by the assertThrows method
                () -> calculator.divide(1, 0)
        );
        assertEquals("/ by zero", exception.getMessage());
    }
}