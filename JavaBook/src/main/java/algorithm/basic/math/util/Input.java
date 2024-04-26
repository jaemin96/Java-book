package algorithm.basic.math.util;

import java.util.Scanner;

public class Input {
     public int intInput() {
         return intInput(0,1000000);
     }

    public int intInput(int min_range, int max_range) {
        int number;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(">> ");
            number = sc.nextInt();
            if(number<min_range || number>max_range) System.out.println("입력 범위를 확인하세요");
        }while(number<min_range || number>max_range);

        sc.close();

        return number;
    }

}
