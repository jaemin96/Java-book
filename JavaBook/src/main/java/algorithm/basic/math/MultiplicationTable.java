package algorithm.basic.math;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("(0 < num < 10) >> ");
            n = sc.nextInt();

            if(n < 0 || n > 10) System.out.println("입력 값의 범위를 확인해주세요");
        }while(n < 0 || n > 10);

        for (int i=1; i<10; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }

        sc.close();
    }
}
