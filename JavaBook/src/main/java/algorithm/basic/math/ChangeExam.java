package algorithm.basic.math;

import java.util.Scanner;

public class ChangeExam {
    public static void main(String[] args) {
        int C; // 거스름 돈
        int Quarter, Dime, Nickel, Penny;

        Scanner sc = new Scanner(System.in);

        do {
            C = sc.nextInt();
            if(C < 1 || C > 500) System.out.println("범위를 확인하세요");
        }while (C < 1 || C > 500);

        Quarter = C / 25;
        C = C % 25;
        Dime = C / 10;
        C = C % 10;
        Nickel = C / 5;
        C = C % 5;
        Penny = C;

        System.out.print(Quarter + " " + Dime + " " + Nickel + " " + Penny);
    }
}
