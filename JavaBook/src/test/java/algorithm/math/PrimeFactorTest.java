package algorithm.math;

import algorithm.basic.math.prime.PrimeFactor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorTest {
    @Test
    public void primFactorTest() {
        PrimeFactor pf = new PrimeFactor();

        pf.primeFactorization(9991);

        int[] expectedFactor = {97,103};

        for (int i=0; i<expectedFactor.length; i++) {
            assertEquals(expectedFactor[i], pf.factors.get(i));
        }
    }
}
