package algorithm.math.combination;

import algorithm.basic.math.combination.BinomialCoefficient;
import org.junit.jupiter.api.*;

public class BinomialCoefficientTest {

    BinomialCoefficient bc;

    @BeforeEach
    void setBc() {
        bc = new BinomialCoefficient();
    }

    @Nested
    @DisplayName("Check binomial-coefficient count")
    class binomialCoefficientTest {
        @Test
        void countCheck() {
            int n = 5;
            int k = 2;
            int expectedCount = 10;
            int actualCount = bc.binomialCoefficient(n,k);

            Assertions.assertEquals(expectedCount, actualCount);
        }
    }

    @Nested
    @DisplayName("Check Properties of Binomial Coefficients")
    class binomialCoefficientPropertiesTest {
        @Test
        @DisplayName("Compare value symmetry with the original - (n,k) == (n, n-k)")
        void symmetryCheck() {
            int n = 5;
            int k = 3;
            int original = bc.binomialCoefficient(n,k);
            int symmetry = bc.binomialCoefficient(n,n-k);
            Assertions.assertEquals(original, symmetry);
        }

        @Test
        @DisplayName("Compare value Pascal's Rule with the original - (n,k) == (n-1, k-1) + (n-1, k)")
        void pascalCheck() {
            int n = 6;
            int k = 3;
            int original = bc.binomialCoefficient(n,k);
            int pascal = bc.binomialCoefficient(n-1, k-1) + bc.binomialCoefficient(n-1, k);
            Assertions.assertEquals(original,pascal);
        }

        @Test
        @DisplayName("Check value boundary-condition - (n,0) | (n,n) == 1")
        void boundaryConditionCheck() {
            int n = 6;
            Assertions.assertEquals(1, bc.binomialCoefficient(n,0));
            Assertions.assertEquals(1, bc.binomialCoefficient(n,n));
        }
    }
}
