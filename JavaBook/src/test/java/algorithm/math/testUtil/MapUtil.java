package algorithm.math.testUtil;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {
    public Map<String, String> mapping(String key, String value) {
        Map<String, String> map = new HashMap<>();
        map.put(key, value);

        return map;
    }
}
