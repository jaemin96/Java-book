package chapter2.operation;

public class IncrementExample {
    static int val1, val2 = 0;
    public static void increVal1() {
        System.out.println("val++ : " + val1++);
    }

    public static void increVal2() {
        System.out.println("++val : " + ++val2);
    }
    public static void main (String[] args) {
        System.out.println("==========================");
        System.out.println("Start value = 0");
        System.out.println();

        for(int i=0; i<=5; i++) {
            increVal1();
        }

        System.out.println();

        for(int i=0; i<=5; i++) {
            increVal2();
        }
        System.out.println("==========================");
    }

}
