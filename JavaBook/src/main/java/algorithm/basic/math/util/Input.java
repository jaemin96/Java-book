package algorithm.basic.math.util;

import java.util.Scanner;

public class Input {
        public int intInput() {
            int number;

            Scanner sc = new Scanner(System.in);
            do {
                System.out.print(">> ");
                number = sc.nextInt();
                if(number<0 || number>1000000) System.out.println("입력 범위를 확인하세요");
            }while(number<0 || number>1000000);

            sc.close();

            return number;
        }

}
