package algorithm.math.sort;

import algorithm.basic.math.sort.CoordinateSortExam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CoordinateSortTest {

    public boolean isMapEquals(List<Map<String,Integer>> array1, List<Map<String,Integer>> array2){
        // 두 배열의 길이가 다르면 다른 배열로 간주
        if (array1.size() != array2.size()) {
            return false;
        }

        // 배열 요소 중 null 값을 가지는 지 검사, 두 배열모두 null 값이면 반복 지속
        for (int i=0; i<array1.size(); i++) {
            Map<String, Integer> map1 = array1.get(i);
            Map<String, Integer> map2 = array2.get(i);

            // 각각의 맵에서 x와 y 값을 가져옴
            Integer x1 = map1.get("x");
            Integer y1 = map1.get("y");
            Integer x2 = map2.get("x");
            Integer y2 = map2.get("y");

            // x좌표 null 값 여부 파악
            if ((x1 != null && x2 == null) || (x1 == null && x2 != null)) {
                return false;
            }

            // y좌표 null 값 여부 파악
            if ((y1 != null && y2 == null) || (y1 == null && y2 != null)) {
                return false;
            }

            // 두 값 모두 null 인 경우 반복 지속
            if (x1 == null && x2 == null) {
                continue;
            }
            if (y1 == null && y2 == null) {
                continue;
            }


            if (array1.get(i) == null && array2.get(i) != null) {
                return false;
            }else if (array1.get(i) != null && array2.get(i) == null) {
                return false;
            }else if(array1.get(i) == null && array2.get(i) == null){
                continue;
            }

            // 값이 서로 같은지 파악 (x와 y중 하나라도 다른 경우 다르다고 간주)
            if (!x1.equals(x2) || !y1.equals(y2)) {
                return false;
            }
        }

        // 모든 예외 처리 조건을 PASS 한 경우 같다고 간주!
        return true;
    }
    @Test
    public void coordinateTest() {
        CoordinateSortExam cds = new CoordinateSortExam();

        // Base!
        List<Map<String, Integer>> baseArray = new ArrayList<>();
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("x", 1);
        map1.put("y", 3);
        baseArray.add(map1);
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("x", 2);
        map2.put("y", 0);
        baseArray.add(map2);
        Map<String,Integer> map3 = new HashMap<>();
        map3.put("x", 1);
        map3.put("y", -1);
        baseArray.add(map3);


        // Expected!
        List<Map<String, Integer>> expectedArray = new ArrayList<>();
        Map<String,Integer> exMap1 = new HashMap<>();
        exMap1.put("x", 1);
        exMap1.put("y", -1);
        expectedArray.add(exMap1);
        Map<String,Integer> exMap2 = new HashMap<>();
        exMap2.put("x", 1);
        exMap2.put("y", 3);
        expectedArray.add(exMap2);
        Map<String,Integer> exMap3 = new HashMap<>();
        exMap3.put("x", 2);
        exMap3.put("y", 0);
        expectedArray.add(exMap3);

        // Actual!
        List<Map<String, Integer>> actualArray = cds.CoordinateSortByAsc(baseArray);

        System.out.println("**** expected");
        for (Map<String,Integer> ex: expectedArray) {
            System.out.println(ex);
        }

        System.out.println();

        System.out.println("**** actual");
        for (Map<String,Integer> ac: actualArray) {
            System.out.println(ac);

        }

        CoordinateSortTest cdTest = new CoordinateSortTest();
        Assertions.assertTrue(cdTest.isMapEquals(expectedArray,actualArray));
    }
}
