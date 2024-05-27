package algorithm.basic.math.deep;

import java.util.*;

public class StatisticsExam {
    // isOdd - 홀수 판단
    public boolean isOdd(double[] values) {
        return (values.length % 2) != 0;
    }

    // removeDuplicates - 배열 중복 제거
    public double[] removeDuplicates(double[] values){
        Set<Double> unique = new HashSet<>();
        for(double n : values) {
            unique.add(n);
        }

        double[] uniqueValues = new double[unique.size()];
        int index = 0;
        for (double n: unique) {
            uniqueValues[index++] = n;
        }

        return uniqueValues;
    }
    // Mean - 평균
    public double Mean(double[] values) {
        int size = values.length;
        if(isOdd(values) & size > 0) {
           double value = 0.0;

           for(double n: values) {
               value += n;
           }

           return value / size;
        }

        return 0.0;
    }

    // Median - 중앙값
    public double Median(double[] values) {
        int size = values.length;
        if(isOdd(values) & size > 0) {
            Arrays.sort(values);
            return values[size/2];
        }

        return 0.0;
    }

    // Mode - 최빈값
    public double Mode(double[] values) {
        // 중복된 요소를 제거한 배열 생성
        double[] unique = this.removeDuplicates(values);
        double mode = 0; // 최빈값 초기화
        int modeCount = 0; // 최빈 카운트 초기화

        // 중복 제거된 배열 루프
        for(double n: unique) {
            int count = 0; // 같은 값을 찾는 횟수
            // 중복 배열 값과 기존 배열 값을 비교하기 위한 기존 배열 루프
            for (int i=0; i<values.length; i++) {
                // 중복배열 값 중 기존 배열의 값과 같은 경우 카운트 증가
                if(n == values[i]) {
                    count++;
                }
            }

            if(count == modeCount) {
                mode = Math.max(mode, n);
            }

            // 초기화된 최빈 카운트가 count 보다 작은 경우
            if(count > modeCount) {
                modeCount = count; // 구한 count 를 최빈 카운트로 지정
                mode = n; // 최빈값을 현재 n 값으로 지정
            }
        }

        // 최종적으로 확정된 최빈값을 리턴
        return mode;
    }

    // Range - 값의 범위
    public double Range(double[] values) {
        double MAX_VALUE = this.getMax(values);
        double MIN_VALUE = this.getMin(values);

        return MAX_VALUE - Math.abs(MIN_VALUE);
    }

    // 배열 중 최대값 찾기 (패키지메서드 사용x)
    public double getMax(double[] values) {
        double MAX_VALUE = 0;

        for (double value: values) {
            if(MAX_VALUE < value) {
                MAX_VALUE = value;
            }
        }

        return MAX_VALUE;
    }

    // 배열 중 최소값 찾기 (패키지메서드 사용x)
    public double getMin(double[] values) {
        double MIN_VALUE = 0;

        for (double value: values) {
            if(MIN_VALUE > value) {
                MIN_VALUE = value;
            }
        }

        return MIN_VALUE;
    }
}
