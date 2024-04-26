package algorithm.basic.math.prime;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor extends Prime {
    public List<Integer> factors;
    public PrimeFactor() {
        factors = new ArrayList<>();
    }

    public void primeFactorization(int n) {
        for (int i=2; i<=n; i++) {
            // 제곱근 처리
           while(n % i == 0) {
               factors.add(i);
               n /= i;
           }
        }
    }
}
