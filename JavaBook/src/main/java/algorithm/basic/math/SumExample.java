package algorithm.basic.math;

import java.util.Scanner;

public class SumExample {
    int value;
    public int checkValue(int value, String type) {
        if(value <= 0 || value >= 10) {
            Scanner sc = new Scanner(System.in);
            this.value = 0;
            System.out.println("입력 가능 범위를 확인해주세요");
            System.out.print(type + " (0 < " + type + " < 10) >> ");
            checkValue(sc.nextInt(), type);
        } else {
            this.value = value;
        }

        return this.value;
    };
    public static void main(String[] args) {
        int A, B;
        int SUM;

        SumExample se = new SumExample();
        Scanner sc = new Scanner(System.in);

        System.out.print("A (0 < A < 10) >> ");
        A = se.checkValue(sc.nextInt(), "A");

        System.out.print("B (0 < B < 10) >> ");
        B = se.checkValue(sc.nextInt(), "B");

        SUM = A + B;
        System.out.println("A + B = " + SUM);

        sc.close();
    }
}
