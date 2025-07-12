import anlov.java.Factorial;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTests {

    @Test
    void factorialOfZeroShouldBeOne() {
        assertEquals(Factorial.getFactorial(0), 1, "Факториал нуля равен 1");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeInputShouldThrowException() {
        Factorial.getFactorial(-1);
    }

    @DataProvider(name = "factorialData")
    public Object[][] provideFactorialData() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {5, 120},
                {7, 5040}
        };
    }

    @Test(dataProvider = "factorialData")
    public void testFactorial(int input, int expected) {
        assertEquals(Factorial.getFactorial(input), expected);
    }

}