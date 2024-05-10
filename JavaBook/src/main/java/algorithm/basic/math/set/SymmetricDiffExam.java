package algorithm.basic.math.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SymmetricDiffExam {
    public List<Map<String, String>> symmetricDiff(List<Map<String, String>> set1, List<Map<String, String>> set2) {
        List<Map<String, String>> array = new ArrayList<>(set1);

        for (Map<String, String> map : set2) {
            if(array.contains(map)) {
                array.remove(map);
            }
        }

        return array;
    }
    public int getSymmetricDiffUnionCount(List<Map<String, String>> A, List<Map<String, String>> B) {
        // A집합 - B집합
        List<Map<String, String>> ADiffB = symmetricDiff(A, B);
        // B집합 - A집합
        List<Map<String, String>> BDiffA = symmetricDiff(B, A);

        // 두 차집합의 합
        List<Map<String, String>> union = new ArrayList<>();
        union.addAll(ADiffB);
        union.addAll(BDiffA);

        return union.size();
    }
    public static void main(String[] args) {

    }
}
