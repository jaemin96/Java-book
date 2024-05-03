package algorithm.basic.math.sort;

import algorithm.basic.math.util.Input;

import java.util.*;

public class CoordinateSortExam extends Sort {
    public List<Map<String, Integer>> CoordinateSortByAsc(List<Map<String, Integer>> array) {
        for (int i=0; i<array.size(); i++) {
            for (int j=i+1; j<array.size(); j++) {
                // null 검사
                if(array.get(i) != null && array.get(j) != null) {
                    // x좌표 검사 시 x의 값이 서로 같은 경우
                    if (array.get(i).get("x").equals(array.get(j).get("x"))) {
                        // y좌표 값을 비교 후 좌항이 크다면 우항과 값을 변경
                        if (array.get(i).get("y") > array.get(j).get("y")) {
                            Map<String,Integer> temp = array.get(i);
                            array.set(i, array.get(j));
                            array.set(j, temp);
                        }
                    }

                    // x좌표 값끼리 비교가 가능한 경우
                    if (array.get(i).get("x") > array.get(j).get("x")) {
                        Map<String,Integer> temp = array.get(i);
                        array.set(i, array.get(j));
                        array.set(j, temp);
                    }
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        Input ipt = new Input();
        CoordinateSortExam cds = new CoordinateSortExam();
        Scanner sc = new Scanner(System.in);
        List<Map<String, Integer>> cdArray = new ArrayList<>();

        int coordinateCount;
        System.out.print(" >> ");
        coordinateCount = ipt.intInput(sc, 0, 1000);

        for (int i=0; i<coordinateCount; i++) {
            int x,y;
            Map<String, Integer> map = new HashMap<>();

            System.out.print("(x,y) >> ");
            x = ipt.intInput(sc,-1001, 1001);
            y = ipt.intInput(sc, -1001, 1001);

            map.put("x", x);
            map.put("y", y);

            cdArray.add(map);
        };

        // 정렬 전 배열
        for (Map<String, Integer> map : cdArray) {
            System.out.println(map);
        }

        // 배열 정렬
        List<Map<String,Integer>> newArray = cds.CoordinateSortByAsc(cdArray);

        // 정렬 후 배열
        for (Map<String, Integer> map : newArray) {
            System.out.println(map);
        }
    }
}
