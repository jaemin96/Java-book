package algorithm.basic.math.prime;

import algorithm.basic.math.util.Input;

import java.util.Scanner;

public class PrimeExam {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        Prime prm = new Prime();
        Input ipt = new Input();

        number = ipt.intInput(sc);

        for (int i=1; i<=number; i++) {
            if(prm.isPrime(i)) {
                prm.primes.add(i);
            }
        }

        for (int p : prm.primes) {
            System.out.print(p+" ");
        }

        sc.close();
    }
}
