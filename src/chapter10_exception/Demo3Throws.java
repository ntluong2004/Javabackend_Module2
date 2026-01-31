package chapter10_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo3Throws {
    static void main() {

        try {
            testException();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }

    static void testException() throws FileNotFoundException {
        File file = new File("jjdkdkdkdkk");

        FileReader fileReader = new FileReader(file);
    }
}
