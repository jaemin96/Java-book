package algorithm.basic.math.combination;

import java.util.Map;

public class BinomialCoefficient extends FactorialExam{
    public int binomialCoefficient(int n, int k) {
        int count = 0;

        /* 이항계수 = 자연수 n개의 요소 중 정수 k개의 요소를 선택하는 가짓 수
         * = n! / k!*(n-k)! 로 구할 수 있다.
         */
        if(n>=1 && k>=0) {
            count = factorial(n) / factorial(k) / factorial(n-k);
        }

        return count;
    }
}
