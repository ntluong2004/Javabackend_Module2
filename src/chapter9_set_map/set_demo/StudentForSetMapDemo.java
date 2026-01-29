package chapter9_set_map.set_demo;

import java.util.Objects;

public class StudentForSetMapDemo implements Comparable<StudentForSetMapDemo> {

    private int id;
    private String name;
    private double score;

    public StudentForSetMapDemo(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentForSetMapDemo that = (StudentForSetMapDemo) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(StudentForSetMapDemo o) {
        return Integer.compare(id, o.id);
    }
}
