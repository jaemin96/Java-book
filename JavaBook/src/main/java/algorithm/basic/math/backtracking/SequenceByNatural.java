package algorithm.basic.math.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceByNatural {
    public int sequenceCheckCases(int N, int M) {
        List<Integer> sequence = new ArrayList<>(); // 수열 저장
        List<List<Integer>> result = new ArrayList<>(); // 수열로 구성된 전체 결과 저장
        boolean[] isUsed = new boolean[N+1]; // 검사하는 수 사용 여부 판단
        backtrack(result, sequence, isUsed, N, M);

        return result.size();
    }

    public List<List<Integer>> sequenceCheck(int N, int M) {
        List<Integer> sequence = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        boolean[] isUsed = new boolean[N+1];
        backtrack(result, sequence, isUsed, N, M);

        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> sequence, boolean[] isUsed, int N, int M) {
        if(sequence.size() == M) {
            result.add(new ArrayList<>(sequence));
            return;
        }

        for (int i=1; i<=N; i++) {
            if(!isUsed[i]){
                isUsed[i] = true; // 해당 값이 사용됨
                sequence.add(i); // 수열에 해당 값을 삽입
                backtrack(result, sequence, isUsed, N, M);
                sequence.remove(sequence.size() -1);
                isUsed[i] = false;
            }
        }
    }

    public int sequenceCheckCasesIsDuplicate(int N, int M) {
        List<Integer> sequence = new ArrayList<>(); // 수열 저장
        List<List<Integer>> result = new ArrayList<>(); // 수열로 구성된 전체 결과 저장
        boolean[] isUsed = new boolean[N+1]; // 검사하는 수 사용 여부 판단
        backtrackDuplicate(result, sequence, isUsed, N, M);

        return result.size();
    }

    public List<List<Integer>> sequenceCheckIsDuplicate(int N, int M) {
        List<Integer> sequence = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        boolean[] isUsed = new boolean[N+1];
        backtrackDuplicate(result, sequence, isUsed, N, M);

        return result;
    }

    public static void backtrackDuplicate(List<List<Integer>> result, List<Integer> sequence, boolean[] isUsed, int N, int M) {
        if(sequence.size() == M) {
            result.add(new ArrayList<>(sequence));
            return;
        }

        for (int i=1; i<=N; i++) {
            if(!isUsed[i]){
                sequence.add(i); // 수열에 해당 값을 삽입
                backtrackDuplicate(result, sequence, isUsed, N, M);
                isUsed[i] = true; // 해당 값이 사용됨
                sequence.remove(sequence.size() -1);
                isUsed[i] = false;
            }
        }
    }
}
