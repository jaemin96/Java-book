package algorithm.basic.math;

import java.util.Scanner;

public class PrimeNumberExam {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 정수의 개수 >>");
        do {
            n = sc.nextInt();
            if(n<0) System.out.println("입력한 값의 범위를 확인해주세요");
        }while(n<0);

        int[] numbers = new int[n];
        for (int i=0; i<n; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int number : numbers) {
            int count=0;
            for(int i=1; i<=number; i++){
                if(number % i ==0) {
                    count += 1;
                }
            }

            if(count == 2) {
                System.out.print(number+" ");
            }
        }
    }
}
