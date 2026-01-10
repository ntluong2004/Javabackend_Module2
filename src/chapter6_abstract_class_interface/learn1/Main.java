package chapter6_abstract_class_interface.learn1;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Teach());
//        people.add(new Student());

        for (Person person : people) {
            person.action();

            if (person instanceof Student) {
                ((Student) person).exam();
            }
        }
    }
}
