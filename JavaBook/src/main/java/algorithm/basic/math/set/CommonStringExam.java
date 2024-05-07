package algorithm.basic.math.set;

import algorithm.basic.math.util.Input;

import java.util.Scanner;

public class CommonStringExam {
    public boolean isCommonStr(String x, String y){
        return x.equals(y);
    }
    public int findCommonStrCount(String[] baseArray, String[] targetArray){
        int count=0;

        for (int i=0; i<targetArray.length; i++) {
            for (int j=0; j<baseArray.length; j++) {
                if (isCommonStr(targetArray[i], baseArray[j])) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        CommonStringExam cs = new CommonStringExam();
        Input ipt = new Input();
        Scanner sc = new Scanner(System.in);

        System.out.print(">> ");
        int baseSize = ipt.intInput(sc, 0, 100);
        String[] baseArray = new String[baseSize];
        System.out.print(">> ");
        for (int b=0; b<baseSize; b++) {
            baseArray[b] = ipt.strInput(sc);
        }

        System.out.print(">> ");
        int targetSize = ipt.intInput(sc, 0, 100);
        String[] targetArray = new String[targetSize];
        System.out.print(">> ");
        for (int t=0; t<targetSize; t++) {
            targetArray[t] = ipt.strInput(sc);
        }

        int commonCount = cs.findCommonStrCount(baseArray, targetArray);

        System.out.print("Common Count: " + commonCount);
    }
}
