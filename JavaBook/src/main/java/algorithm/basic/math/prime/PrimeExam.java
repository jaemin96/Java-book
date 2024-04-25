package algorithm.basic.math.prime;

import algorithm.basic.math.util.Input;

public class PrimeExam {
    public static void main(String[] args) {
        int number;
        Prime prm = new Prime();
        Input ipt = new Input();

        number = ipt.intInput();

        for (int i=1; i<=number; i++) {
            if(prm.isPrime(i)) {
                prm.primes.add(i);
            }
        }

        for (int p : prm.primes) {
            System.out.print(p+" ");
        }
    }
}
