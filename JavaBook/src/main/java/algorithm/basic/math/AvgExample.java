package algorithm.basic.math;

import java.util.Scanner;

public class AvgExample {
    public double M = 0; // 점수 최대®값
    public static double total=0;
    public static void main(String[] args) {
        int count;
        AvgExample ave = new AvgExample();
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성

        count = sc.nextInt(); // 입력 과목 수 지정
        double[] scores = new double[count];

        for (int i = 0; i<count; i++) {
            scores[i] = sc.nextDouble();
        }

        // 최고점 설정
        for(double score : scores) {
            if(score > ave.M) {
                ave.M = score;
            }
        }

        System.out.print("scores:");
        for (int i = 0; i < count; i++) {
            System.out.print(scores[i]+ " ");
        }

        System.out.println();

        System.out.print("updated scores:");
        for (int i = 0; i < count; i++) {
            scores[i] = scores[i]/ave.M * 100;
            System.out.print(scores[i] + " ");

            ave.total += scores[i];
        }
        System.out.println();

        System.out.println("Avg scores: " + ave.total/count);
    }
}
