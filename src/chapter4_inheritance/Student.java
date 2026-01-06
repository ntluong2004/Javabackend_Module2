package chapter4_inheritance;

import java.util.Scanner;

public class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        super(id, name);
        this.setScore(score);
    }

    public Student(double score) {
        this.score = score;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.println("Enter your score");
        this.setScore(input.nextDouble());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Score: " + this.getScore());
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    void main() {
        input();
        output();
    }
}
