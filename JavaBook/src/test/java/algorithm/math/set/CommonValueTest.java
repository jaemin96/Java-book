package algorithm.math.set;

import algorithm.basic.math.set.CommonValueExam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommonValueTest {
    @Test
    public void commonValueTest() {
        CommonValueExam cv = new CommonValueExam();
        int[] baseArray = {5,-10,4,1,9,6};
        int[] targetArray = {1,2,3,4,5,6,7,8,9,10};

        int[] expectedArray = {1,0,0,1,1,1,0,0,1,0};
        int[] actualArray = cv.findCommonValues(baseArray, targetArray);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }
}
