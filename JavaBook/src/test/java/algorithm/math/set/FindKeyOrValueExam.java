package algorithm.math.set;

import algorithm.basic.math.util.Input;

import java.util.*;

public class FindKeyOrValueExam {
    // items 리스트에 임의의 str 값에 해당하는 key OR value 찾기
    public String searchValue(String str, List<Map<String,String>> items) {
        if(items.size() <= 0) {
            return "List is empty..";
        }

        for (Map<String,String> item: items) {
            for (Map.Entry<String,String> entry: item.entrySet()) {
                if(entry.getKey().equals(str)) {
                    return entry.getValue();
                } else if (entry.getValue().equals(str)) {
                    return entry.getKey();
                }
            }
        }
        return "Not Found";
    };
    public static void main(String[] args) {
        FindKeyOrValueExam fkv = new FindKeyOrValueExam();
        List<Map<String, String>> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Input ipt = new Input();

        System.out.print(">> ");
        int n = ipt.intInput(sc, 0, 10000); // n: 아이템 리스트에 추가될 아이템 수

        for (int i=0; i<n; i++){
            String key = ipt.strInput(sc);
            String value = ipt.strInput(sc);

            Map<String, String> map = new HashMap<>();

            // 중복 Key 검사
            boolean isCommon = false;
            for (Map<String, String> item: items) {
                if(item.containsKey(key)) {
                    for (Map.Entry<String, String> entry : item.entrySet()) {
                        entry.setValue(value);
                        isCommon = true;
                        break;
                    }
                }
            };

            if(!isCommon) {
                map.put(key,value);
                items.add(map);
            }
        }

        System.out.print(">> ");
        String search = ipt.strInput(sc);

        String searchedItem = fkv.searchValue(search, items);

        System.out.print("Searched Value: " + searchedItem);

        sc.close();
    }
}
