package chapter10_exception;

public class Demo1 {
    static void main() {
        String str = "123acb";

        int x = Integer.parseInt(str);

        System.out.println("x= " + x);
        System.out.println("Program end no errors");
    }
}
