package algorithm.basic.math.combination;

public class DiffExam {
    // a,b 가 N 개의 물건을 서로 가질 경우 그 물건이 서로 다를 경우의 수를 구하기
    // 조건 1) a,b의 i번째 물건은 항상 같다.
    public int getDiffCount(int n) {
        /* N개의 물건 중 a의 i번 째와 b의 물건이 다른 경우는 i번 째를 제외한 경우이니
         * 경우의 수를 산출하려면 n * (n-1) 공식으로 산출 가능
         */
        if(n >= 0) {
            return n*(n-1);
        }else {
            return 0;
        }
    }

    public int getDiffOrigin(int n) {
        int count = 0;

        // a,b 를 검사하며 인덱스가 다른 경우에만 count 증가
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if(i != j) {
                    count++;
                }
            }
        }

        return count;
    }
}
