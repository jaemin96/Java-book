package algorithm.basic.math.util;

import java.util.Scanner;

public class Input {
     public int intInput(Scanner sc) {
         return intInput(sc,0,1000000);
     }

    public int intInput(Scanner sc,int min_range, int max_range) {
        int number;
        do {
            System.out.print(">> ");
            number = sc.nextInt();
            if(number<min_range || number>max_range) System.out.println("입력 범위를 확인하세요");
        }while(number<min_range || number>max_range);

        return number;
    }

}
