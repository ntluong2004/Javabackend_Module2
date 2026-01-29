package chapter9_set_map.set_demo;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    static void main() {
        Set<StudentForSetMapDemo> set = new TreeSet<>();

        set.add(new StudentForSetMapDemo(1, "Nguyen Tien Luong", 9.0));
        set.add(new StudentForSetMapDemo(2, "Nguyen Tien Luong", 9.0));
        set.add(new StudentForSetMapDemo(3, "Nguyen Tien Luong", 9.7));

        System.out.println(set.size());
    }
}
