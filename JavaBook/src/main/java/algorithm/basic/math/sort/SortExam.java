package algorithm.basic.math.sort;

import algorithm.basic.math.util.Input;

import java.util.Scanner;

public class SortExam {
    // 오름차순 정렬
    public int[] sortByASC(int[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if(array[i] > array[j]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    // 내림차순 정렬
    public int[] sortByDESC(int[] array) {
        for (int i=0; i<array.length-1; i++) {
            for (int j=i+1; j<array.length; j++) {
                if(array[i] < array[j]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

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
