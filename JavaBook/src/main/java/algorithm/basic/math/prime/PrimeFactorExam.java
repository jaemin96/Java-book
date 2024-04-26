package algorithm.basic.math.prime;

import algorithm.basic.math.util.Input;

import java.util.Scanner;

public class PrimeFactorExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeFactor pf = new PrimeFactor();
        Input ipt = new Input();
        int number = ipt.intInput(sc);

        // 입력 정수 소인수분해
        pf.primeFactorization(number);

        for (int factor : pf.factors) {
            System.out.print(factor + " ");
        }

        sc.close();
    }
}
