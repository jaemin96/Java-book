package algorithm.math.deep;

import algorithm.basic.math.deep.StatisticsExam;
import org.junit.jupiter.api.*;

import java.util.Arrays;

public class StatisticsTest {
    @Nested
    @DisplayName("Statistics")
    class StTest {
        StatisticsExam st;
        @BeforeEach
        void setUp(){
            st = new StatisticsExam();
        }

        @Nested
        @DisplayName("Mean")
        class MeanTest {
            @Test
            @DisplayName("it check mean value")
            void checkMean() {
                double[] values = {13.0, 21.0, 87.0, -17.0, 11.0};
                Assertions.assertTrue(st.isOdd(values));
                double expectedValue = 23;
                double actualValue = st.Mean(values);
                Assertions.assertEquals(expectedValue, actualValue);
            }
        }

        @Nested
        @DisplayName("Median")
        class MedianTest {
            @Test
            @DisplayName("it check median value")
            void checkMedian() {
                double[] values = {-46.2, 11.9, 4.0, -17.6, -90.0, 8.0, 123.0};
                Assertions.assertTrue(st.isOdd(values));
                double expectedValue = 4;
                double actualValue = st.Median(values);
                Assertions.assertEquals(expectedValue, actualValue);
            }
        }

        @Nested
        @DisplayName("Mode")
        class ModeTest {
            @Test
            @DisplayName("it remove duplicate on array")
            void checkDuplicate() {
                double[] values = {3.0, 9.0, -11.0, 12.5, 3.0, 3.0, -89.0};
                double[] expectedValue = {3.0, 9.0, -11.0, 12.5, -89.0};
                double[] actualValue = st.removeDuplicates(values);
                Arrays.sort(expectedValue);
                Arrays.sort(actualValue);
                Assertions.assertArrayEquals(expectedValue, actualValue);
            }
            @Test
            @DisplayName("it check mode value")
            void checkMode() {
                double[] values = {3.0, 9.0, -11.0, 12.5, 3.0, 3.0, -89.0};
                double expectedValue = 3.0;
                double actualValue = st.Mode(values);
                Assertions.assertEquals(expectedValue, actualValue);
            }
        }

        @Nested
        @DisplayName("Range")
        class RangeTest {
            double[] values;
            @BeforeEach
            void setUp() {
                values = new double[]{1.5, -3.4, 7.7, 12.1, -2.9, 6.5, 1.0};
            }
            @Test
            @DisplayName("it check max on values")
            void checkMax() {
                double MAX_VALUE = st.getMax(this.values);
                Assertions.assertEquals(12.1, MAX_VALUE);
            }

            @Test
            @DisplayName("it check max on values")
            void checkMin() {
                double MIN_VALUE = st.getMin(this.values);
                Assertions.assertEquals(-3.4, MIN_VALUE);
            }

            @Test
            @DisplayName("it check range on values")
            void checkMode() {
                double expectedValue = 8.7;
                double actualValue = st.Range(this.values);
                Assertions.assertEquals(expectedValue, actualValue);
            }
        }
    }
}
