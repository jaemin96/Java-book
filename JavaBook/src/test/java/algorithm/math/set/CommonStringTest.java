package algorithm.math.set;

import algorithm.basic.math.set.CommonStringExam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommonStringTest {
    @Test
    public void commonStrTest() {
        CommonStringExam cs = new CommonStringExam();
        String[] baseArray = {"apple", "people", "person", "hello", "world!"};
        String[] targetArray = {"apple", "world", "ABC", "korea", "person"};

        int expectedCount = 2;
        int actualCount = cs.findCommonStrCount(baseArray, targetArray);

        Assertions.assertEquals(expectedCount, actualCount);
    }
}
