package algorithm.basic.math.sort;

import algorithm.basic.math.util.Input;

import java.util.Scanner;

public class SortExam extends Sort {
    public static void main(String[] args) {
        SortExam se = new SortExam();
        Input ipt = new Input();
        Scanner sc = new Scanner(System.in);

        int inputCount;
        System.out.print(">> ");
        inputCount = ipt.intInput(sc, 0, 1000);

        int[] array = new int[inputCount];
        System.out.print(">> ");
        for (int i=0; i<inputCount; i++) {
            array[i] = ipt.intInput(sc,0,1000);
        }

        System.out.println("** 정렬되지 않은 기본 **");
        for (int a : array){
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("** 오름차순 정렬 **");
        for (int a : se.sortByASC(array)){
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("** 내림차순 정렬 **");
        for (int a : se.sortByDESC(array)){
            System.out.print(a + " ");
        }

        sc.close();
    }
}
