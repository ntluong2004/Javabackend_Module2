package chapter9_set_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPractice1 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter");
        String str = input.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
