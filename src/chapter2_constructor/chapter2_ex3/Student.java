package chapter2_constructor.chapter2_ex3;

public class Student {
    private static int nextId = 1;

    private final int id;
    private String name;
    private double score;

    public Student(String name, double score) {
        this.id = nextId++;
        setName(name);
        setScore(score);
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name==null || name.trim().isEmpty()){
            System.out.println("Student name can't empty");
        }
        else {
            this.name = name;
        }
    }

    public double getScore(){
        return score;
    }

    public void setScore(double score){
        if(score >= 0 && score <= 10){
            this.score = score;
        }
        else{
            System.out.println("Student score can't less than 0 and greater than 10");
        }
    }

    public void exportStudent(){
        System.out.println("Student id: " + id + " name: " + name + " score: " + score);
    }


}
