package chapter9_set_map.exercise.ex2;

import java.util.HashMap;
import java.util.Map;

public class Ex2BMapPractice {
    public static void main(String[] args) {

// b. Kiểm tra tính duy nhất của tên
        String[] names = {"Quang", "Luong", "Truong", "Thien", "Quang"};

        Map<String, Integer> nameMap = new HashMap<>();

        for (String name : names) {
            if (nameMap.containsKey(name)) {
                nameMap.put(name, nameMap.get(name) + 1);
            } else {
                nameMap.put(name, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();

            System.out.println(name + ": " + count);
        }
    }
}
