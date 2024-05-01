package algorithm.math;

import algorithm.basic.math.search.MinimumCountExam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumCountTest {
    @Test
    public void minimumTest() {
        MinimumCountExam mc = new MinimumCountExam();

        int expectedValue1 = mc.findMinCount(18);
        int expectedValue2 = mc.findMinCount(4);
        int expectedValue3 = mc.findMinCount(6);
        int expectedValue4 = mc.findMinCount(9);

        Assertions.assertEquals(expectedValue1, 4);
        Assertions.assertEquals(expectedValue2, -1);
        Assertions.assertEquals(expectedValue3, 2);
        Assertions.assertEquals(expectedValue4, 3);
    }
}
