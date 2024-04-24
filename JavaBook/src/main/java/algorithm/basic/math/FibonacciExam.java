package algorithm.basic.math;

import java.util.Scanner;

public class FibonacciExam {
    int[] fArray;
    public FibonacciExam(int n) {
        fArray = new int[n+1];
    }
    public int fibonacci(int n) {
        if(n < 0) {
            System.out.println("0보다 큰 값을 입력해주세요");
            return 0;
        }

        if(n == 0) {
            fArray[0] = 0;
            return 0;
        }else if(n == 1) {
            fArray[1] = 1;
            return 1;
        }else {
            if(fArray[n] == 0) {
                fArray[n] = fibonacci(n-2) + fibonacci(n-1);
            }
            return fArray[n];
        }
    }
    public static void main(String[] args) {
        /* fibonacci(n)에서 n을 설정하기 위한 로직*/
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("0보다 큰 정수 n을 입력하세요 >> ");
        do {
            n = sc.nextInt();
            if(n < 0) System.out.println("입력가능한 범위를 확인해주세요");
        }while(n < 0);

        /* 설정한 n을 통해 fibonacci(n)을 출력하는 로직 */
        FibonacciExam fibo = new FibonacciExam(n); // n+1 만큼 메모리를 가지는 배열을 생성하기 위해 n을 넘겨줌
        fibo.fibonacci(n); // 실제 피보나치 연산을 수행하게 될 피보나치 함수 실행

        // 정수 n+1만큼의 길이를 가지는 배열 fArray를 통해 fibonacci(0)~fibonacci(n)의 값을 출력
        for (int fvalue: fibo.fArray) {
            System.out.print(fvalue+" ");
        }
    }
}
