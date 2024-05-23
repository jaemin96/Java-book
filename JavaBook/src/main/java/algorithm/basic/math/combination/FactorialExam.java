package algorithm.basic.math.combination;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FactorialExam {
    Map<String, BigInteger> factorCache;
    public FactorialExam() {
        factorCache = new HashMap<>();
    }

    public BigInteger factorial(int n) {
        BigInteger value = BigInteger.ONE;
        String key = n + "!";

        /*
         * 팩토리얼(!) 은 1~n 까지 1씩 증가하며 모든 수를 곱한 결과이다.
         * 5! == 1*2*3*4*5
         * 특정 n에서 다음 수를 곱하기 위해 재귀적인 동작으로 처리
         * 5! == 5*4! == 5*4*3! == 5*4*3*2!
         */
        if(n > 1) {
            if(factorCache.containsKey(key)) {
                return factorCache.get(key);
            }else {
                value = BigInteger.valueOf(n).multiply(factorial(n - 1));
                factorCache.put(key, value);
            }
        }

        return value;
    }
}
