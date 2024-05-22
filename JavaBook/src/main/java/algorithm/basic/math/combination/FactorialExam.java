package algorithm.basic.math.combination;

public class FactorialExam {
    public int factorial(int n) {
        int value = 1;

        /**
         * 팩토리얼(!) 은 1~n 까지 1씩 증가하며 모든 수를 곱한 결과이다.
         * 5! == 1*2*3*4*5
         * 특정 n에서 다음 수를 곱하기 위해 재귀적인 동작으로 처리
         * 5! == 5*4! == 5*4*3! == 5*4*3*2!
         */
        if(n > 1) {
            value = n * factorial(n-1);
        }

        return value;
    }
}
