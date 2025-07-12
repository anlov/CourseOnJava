import anlov.java.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class FactorialTest {

    @DisplayName("Check factorial if num equals 0")
    @Test
    void checkFactorial() {
        assertEquals(1, Factorial.getFactorial(0));
    }

    @DisplayName("Check factorial if num more 0")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void checkMoreZero(int num) {
        long[] numbers = {1, 2, 6, 24};
        assertEquals(numbers[num - 1], Factorial.getFactorial(num));

    }

    @Test
    void negativeInputShouldThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> Factorial.getFactorial(-5), "Число должно быть больше нуля");
    }
}
