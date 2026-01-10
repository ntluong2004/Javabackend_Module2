package chapter6_abstract_class_interface.learn1;

public class Teach extends Person {
    public void action() {
        System.out.println("Teaching");
    }

    @Override
    public void song() {
        System.out.println("Teacher sing a song");
    }
}
