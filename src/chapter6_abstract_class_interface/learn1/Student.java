package chapter6_abstract_class_interface.learn1;

public class Student extends Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void action() {
        System.out.println("Learning");
    }

    public void exam() {
        System.out.println("Do exam");
    }


    @Override
    public void song() {
        System.out.println("Student sing a song");
    }
}
