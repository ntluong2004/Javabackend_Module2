package chapter9_set_map.map_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Map1 {
    static void main() {
        Map<String, Integer> map = new HashMap<>();

        map.put("a", 10);
        map.put("c", 20);
        map.put("b", 30);

        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        System.out.println(map.get("c"));
        System.out.println(map);

        Set<String> set = map.keySet();

//        case 1
        for (String key : set) {
            System.out.println(key + ": " + map.get(key));
        }

//        case 2
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
