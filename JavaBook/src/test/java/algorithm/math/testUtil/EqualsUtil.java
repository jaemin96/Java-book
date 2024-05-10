package algorithm.math.testUtil;

import java.util.List;
import java.util.Map;

public class EqualsUtil {
    public boolean isEqualsList(List<Map<String,String>> array1, List<Map<String,String>> array2) {
        // 두 배열의 길이가 다르면 다른 배열로 간주
        if (array1.size() != array2.size()) {
            return false;
        }

        // 배열 요소 중 null 값을 가지는 지 검사, 두 배열모두 null 값이면 반복 지속
        for (int i=0; i<array2.size(); i++) {
            Map<String, String> map1 = array1.get(i);
            Map<String, String> map2 = array2.get(i);

            for (Map.Entry<String, String> eEntry : map1.entrySet()) {
                for (Map.Entry<String, String> aEntry : map2.entrySet()) {
                    if ((eEntry.getKey() == null && aEntry.getKey() != null) || (eEntry.getKey() != null && aEntry.getKey() == null)) {
                        return false;
                    }

                    if ((eEntry.getValue() == null && aEntry.getValue() != null) || (eEntry.getValue() != null && aEntry.getValue() == null)) {
                        return false;
                    }

                    if (eEntry.getKey() == null && aEntry.getKey() == null) {
                        continue;
                    }

                    if (eEntry.getValue() == null && aEntry.getValue() == null) {
                        continue;
                    }

                    if (!eEntry.getKey().equals(aEntry.getKey()) || !eEntry.getValue().equals(aEntry.getValue())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
