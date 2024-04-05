package chapter2.operation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncrementExampleTest {
    @Test
    public void incrementTest() {
        int value1 = 0;
        int value2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        sum1 += value1++;
        sum2 += ++value2;
        sum3 = value1 + value2;

        assertEquals(1, value1);
        assertEquals(1, value2);
        assertEquals(0, sum1);
        assertEquals(1, sum2);
        assertEquals(2, sum3);
    }
}
