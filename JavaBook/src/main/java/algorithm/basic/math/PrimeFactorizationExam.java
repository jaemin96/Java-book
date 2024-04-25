package algorithm.basic.math;

import java.util.Scanner;

public class PrimeFactorizationExam {
    int[] factors; //  TODO: 추후 동적 배열 선언 방식으로 수정!
    int factorIndex=0;
    int[] primes;

    public PrimeFactorizationExam(int n) {
      factors = new int[n/2 + 1];
    }
    public int[] prime(int N) {
        int[] primes = new int[N];

        for(int i=1; i<=N; i++){
            int count=0;
            for(int j=1; j<=i; j++){
                if(i % j == 0) {
                    count += 1;
                }
            }

            if(count == 2) {
                primes[i-1] = i;
            }else {
                primes[i-1] = 0;
            }
        }

        return primes;
    }

    public int[] primeFactor(int N) {
        for (int number : this.primes){
            if(N >= number) {
                if(N % number == 0) {
                    this.factors[this.factorIndex] = number;
                    if(N != number && N/number != 1) {
                        this.factorIndex++;
                        primeFactor(N/number);
                        return this.factors;
                    }
                }
            }
        }
        return this.factors;
    }
    public static void main(String[] args) {
        int N; // 소인수분해할 입력 정수 값

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print(" N >> ");
            N = sc.nextInt();

            if(N < 0 || N > 10000000) System.out.println("Error:입력 값의 범위를 확인하세요");
        }while(N < 0 || N > 10000000);

        PrimeFactorizationExam pf = new PrimeFactorizationExam(N);

        int primeCount=0;
        for (int n : pf.prime(N)) {
            if(n != 0) {
                primeCount++;
            }
        }

        int[] primes = new int[primeCount];
        int index=0;
        for (int n : pf.prime(N)){
            if(n != 0){
                primes[index] = n;
                index++;
            }
        }

        pf.primes = primes;
        pf.primeFactor(N);

        for (int f : pf.factors) {
            if(f != 0) {
                System.out.print(f+" ");
            }
        }
    }
}
