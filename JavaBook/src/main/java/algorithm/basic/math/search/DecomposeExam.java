package algorithm.basic.math.search;

import algorithm.basic.math.util.Input;

import java.util.Scanner;

public class DecomposeExam {
    int digitCount=1;
    int maxDigitSum;
    public int getMaxDigitSum(int dcSum) {
        int total = 0;

        while(dcSum/10 != 0) {
            total += 9;
            this.digitCount++;
            dcSum /= 10;
        }

        return total;
    }

    public int getConstructor(int dcSum) {
        int constructor = 0;
        int rangeMin = this.digitCount > 1 ? dcSum-this.maxDigitSum : 1;
        for (int i=rangeMin; i<dcSum; i++) {
            int digitSum = 0;
            if(i < 10 && (i+i) == dcSum) {
                constructor = i;
                break;
            }

            //각 자릿수의 합
            int deposeValue = i;
            for (int k=this.digitCount-1; k>=0; k--){
                digitSum += deposeValue / (int)Math.pow(10,k);
                deposeValue %= (int)Math.pow(10,k);
            }

            if(i+digitSum == dcSum) {
                constructor = i;
                break;
            }
        }

        return constructor;
    }

    public static void main(String[] args) {
        int decomposeSum;
        Input ipt = new Input();
        Scanner sc = new Scanner(System.in);
        DecomposeExam dcp = new DecomposeExam();

        decomposeSum = ipt.intInput(sc,1,1000000);

        dcp.maxDigitSum = dcp.getMaxDigitSum(decomposeSum);
        int constructor = dcp.getConstructor(decomposeSum);

        System.out.print("constructor >> " + constructor);

        sc.close();
    }
}
