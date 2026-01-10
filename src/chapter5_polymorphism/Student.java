package chapter5_polymorphism;

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
}
