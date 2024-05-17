package algorithm.math.data;

import algorithm.basic.math.data.LastValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LastValueTest {
    @Test
    public void lastValueTest() {
        LastValue lv = new LastValue();
        lv.push(1);
        lv.push(2);
        lv.push(3);
        lv.push(4);
        lv.push(5);
        lv.push(6);
        lv.push(7);
        int expectedLast = 6;
        int actualLast = lv.findLastValueOfQue();
        Assertions.assertEquals(expectedLast, actualLast);
    }
}
