package algorithm.math.deep;

import algorithm.basic.math.deep.DividendExam;
import org.junit.jupiter.api.*;

public class DividendTest {
    DividendExam di;

    @BeforeEach
    void setUp(){
        di = new DividendExam();
    }

    @Nested
    @DisplayName("Dividend test")
    class dividendTest {
        @Test
        @DisplayName("check dividend number by even divisors")
        void checkDividendNumByEven() {
            int[] divisors = {14,26456,2,28,13228,3307,7,23149,8,6614,46298,56,4,92596};
            int expectedNum = 185192;
            int actualNum = di.findDividendNum(divisors);
            Assertions.assertEquals(expectedNum, actualNum);
        }

        @Test
        @DisplayName("check dividend number by odd divisors")
        void checkDividendNumByOdd() {
            int[] divisors = {2,3,4,6,9,12,18};
            int expectedNum = 36;
            int actualNum = di.findDividendNum(divisors);
            Assertions.assertEquals(expectedNum, actualNum);
        }
    }
}