package algorithm.basic.math.deep;

import java.util.Arrays;

public class DividendExam {
    public int findDividendNum(int[] divisors) {
        int N = 0;
        int size = divisors.length; // 약수 총 개수
        Arrays.sort(divisors); // 약수들 정렬

        // Even
        if(size % 2 == 0) {
            N = divisors[0] * divisors[size -1];
        }else {
            // Odd
            int mid = size / 2;
            N = (int)Math.pow(divisors[mid], 2);
        }

        return N;
    }
}