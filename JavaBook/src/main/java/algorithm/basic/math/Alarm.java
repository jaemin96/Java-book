package algorithm.basic.math;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        int H,M;
        final int DM = 15;
        Scanner sc = new Scanner(System.in);

        // 시간 입력
        do{
            System.out.print("(0 <= H < 23) >> ");
            H = sc.nextInt();
            if(H < 0 || H > 23) System.out.println("입력 범위를 확인하세요");
        }while(H < 0 || H > 23);

        // 분 입력
        do{
            System.out.print("(0 <= M <= 59) >> ");
            M = sc.nextInt();
            if(M < 0 || M > 59) System.out.println("입력 범위를 확인하세요");
        }while(M < 0 || M > 59);

        if((M-DM) < 0) {
            H -= 1;
            M = 60 + (M-DM);
        }else {
            M -= DM;
        }

        System.out.println("기존 알람시간에서 " + DM + "분 전은 " + H + ":" + M);
        sc.close();
    }
}
