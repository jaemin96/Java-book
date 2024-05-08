package algorithm.basic.math.set;

import algorithm.basic.math.util.Input;

import java.util.*;

public class ValueOfKeyExam {
    public List<Map<String, String>> findValuesOfKey(List<Map<String,String>> array) {
        List<Map<String,String>> findArray = new ArrayList<>();

        for (int i=0; i<array.size(); i++) {
            if (array.get(i).containsValue("true")) {
                findArray.add(array.get(i));
            }
        }

        for (Map<String,String> map: findArray) {
            System.out.println(map);
        }

        return findArray;
    }

    public static void main(String[] args) {
        Input ipt = new Input();
        Scanner sc = new Scanner(System.in);
        ValueOfKeyExam vok = new ValueOfKeyExam();

        System.out.print(">> ");
        int logCount = ipt.intInput(sc, 0, 10000);

        List<Map<String,String>> logs = new ArrayList<>();

        for (int i=0; i<logCount; i++) {
            System.out.print(">> ");
            String key = ipt.strInput(sc);
            String value = ipt.strInput(sc);

            // logs 리스트에 동일한 key를 가진 항목이 있는 지 검사, 있다면 갱신
            boolean isCommon = false;
            for (Map<String, String> map: logs){
                if (map.containsKey(key)) {
                    map.put(key,value);
                    isCommon = true;
                    break;
                }
            }

            // 동일한 Key가 없는 경우 새로운 Map 객체를 생성해서 리스트에 삽입
            if(!isCommon) {
                Map<String, String> map = new HashMap<>();
                map.put(key,value);
                logs.add(map);
            }
        }

        for (Map<String,String> map :vok.findValuesOfKey(logs)) {
            for (String key : map.keySet()) {
                System.out.print(key+" ");
            }
        }
    }
}
