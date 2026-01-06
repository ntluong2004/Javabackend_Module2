package chapter4_inheritance;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name");
        this.name = input.nextLine();
    }

    public void output() {
        System.out.println("Name: " + this.name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
