package algorithm.basic.math.prime;

import algorithm.basic.math.util.Input;

public class PrimeFactorExam {
    public static void main(String[] args) {
        PrimeFactor pf = new PrimeFactor();
        Input ipt = new Input();
        int number = ipt.intInput();

        // 입력 정수 소인수분해
        pf.primeFactorization(number);

        for (int factor : pf.factors) {
            System.out.print(factor + " ");
        }
    }
}
