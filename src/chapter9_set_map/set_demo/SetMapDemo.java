package chapter9_set_map.set_demo;

import java.util.HashSet;
import java.util.Set;

public class SetMapDemo {
    static void main() {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(40);


        System.out.println(set);

    }
}
