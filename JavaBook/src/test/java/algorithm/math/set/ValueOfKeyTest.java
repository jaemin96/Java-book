package algorithm.math.set;

import algorithm.basic.math.set.ValueOfKeyExam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValueOfKeyTest {
    public boolean isEquals(List<Map<String,String>> array1, List<Map<String,String>> array2) {
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

    @Test
    public void valueOfKeyTest() {
        ValueOfKeyExam vok = new ValueOfKeyExam();

        // Base
        List<Map<String,String>> baseArray = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("jaemin", "true");
        Map<String, String> map2 = new HashMap<>();
        map2.put("jerry", "true");
        Map<String, String> map3 = new HashMap<>();
        map3.put("mark", "true");
        Map<String, String> map4 = new HashMap<>();
        map4.put("july", "false");
        baseArray.add(map1);
        baseArray.add(map2);
        baseArray.add(map3);
        baseArray.add(map4);

        // Expected
        List<Map<String,String>> expectedArray = new ArrayList<>();
        Map<String, String> exMap1 = new HashMap<>();
        exMap1.put("jaemin", "true");
        Map<String, String> exMap2 = new HashMap<>();
        exMap2.put("jerry", "true");
        Map<String, String> exMap3 = new HashMap<>();
        exMap3.put("mark", "true");
        expectedArray.add(exMap1);
        expectedArray.add(exMap2);
        expectedArray.add(exMap3);

        // Actual
        List<Map<String,String>> actualArray = vok.findValuesOfKey(baseArray);

        Assertions.assertTrue(isEquals(expectedArray,actualArray));
    }
}
