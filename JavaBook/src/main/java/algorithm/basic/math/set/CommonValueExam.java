package algorithm.basic.math.set;

import algorithm.basic.math.util.Input;

import java.util.Scanner;

public class CommonValueExam {

    public boolean isCommon(int x, int y) {
        return x == y;
    }

    /*
     * baseArray: 기본 배열
     * targetArray: 기본 배열안에 같은 값이 있는지 비교할 배열
     */
    public int[] findCommonValues(int[] baseArray, int[] targetArray) {
        int[] commonValues = new int[targetArray.length];

        for (int i=0; i<targetArray.length; i++) {
            for (int j=0; j<baseArray.length; j++) {
                if (isCommon(targetArray[i], baseArray[j])) {
                    commonValues[i] = 1;
                }
            }
        }

        return commonValues;
    }
    public static void main(String[] args) {
        CommonValueExam cv = new CommonValueExam();
        Input ipt = new Input();
        Scanner sc = new Scanner(System.in);
        int baseSize, targetSize;

        System.out.print(">> ");
        baseSize = ipt.intInput(sc, 0, 100);
        int[] baseArray = new int[baseSize];
        System.out.print(">> ");
        for (int b=0; b<baseSize; b++) {
            baseArray[b] = ipt.intInput(sc, -100000, 100000);
        }

        System.out.print(">> ");
        targetSize = ipt.intInput(sc, 0, 100);
        int[] targetArray = new int[targetSize];
        System.out.print(">> ");
        for (int t=0; t<targetSize; t++) {
            targetArray[t] = ipt.intInput(sc, -100000, 100000);
        }

        int[] commonValues = cv.findCommonValues(baseArray, targetArray);

        for (int common: commonValues) {
            System.out.print(common + " ");
        }

        sc.close();
    }
}
