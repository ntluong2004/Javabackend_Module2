package chapter5_polymorphism.Test1;

import chapter5_polymorphism.Person;

import java.util.Objects;

public class Student extends Person {

    private int id;
    private String name;
    private double score;



    public int getId() {
        return id;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name, double score) {
        this.score = score;
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s", id, name, score);
    }
}
