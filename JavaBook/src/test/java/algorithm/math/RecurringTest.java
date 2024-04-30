package algorithm.math;

import algorithm.basic.math.search.RecurringExam;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecurringTest {
    @Test
    public void recurringTest() {
        RecurringExam rc = new RecurringExam();

        int expectedValue1 = rc.findNthRecurringNumber(187);
        int expectedValue2 = rc.findNthRecurringNumber(500);

        assertEquals(expectedValue1, 66666);
        assertEquals(expectedValue2, 166699);
    }
}
