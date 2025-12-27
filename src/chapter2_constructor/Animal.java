package chapter2_constructor;

public class Animal {

    private int id;

    private String name;

    private String color;

    private String sex;

    public Animal() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Animal(int id, String name, String color, String sex) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.sex = sex;
    }
}
