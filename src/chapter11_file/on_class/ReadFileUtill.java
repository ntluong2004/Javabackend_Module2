package chapter11_file.on_class;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtill {
    private static List<String> readFile(String path) {

        List<String> lines = new ArrayList<String>();
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        try {
            File file = new File(path);

            fileReader = new FileReader(file);

            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("omg error");
                }
            }

            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("omg error");
                }
            }
        }
        return lines;
    }

    public static List<Student> readStudentFile(String path) {
        List<Student> students = new ArrayList<>();
        List<String> lines = readFile(path);

        for (String line : lines) {
            String[] info = line.split(",");

            Student student = new Student(
                    Integer.parseInt(info[0]),
                    info[1],
                    Double.parseDouble(info[2]));

            students.add(student);
        }

        return students;
    }

    static void main() {
        List<Student> students = readStudentFile("src/chapter11_file/on_class/students.csv");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
