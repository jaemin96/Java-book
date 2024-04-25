package algorithm.basic.math.prime;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    public List<Integer> primes;

    public Prime() {
        primes = new ArrayList<>();
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
