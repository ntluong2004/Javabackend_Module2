package chapter5_polymorphism;

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
