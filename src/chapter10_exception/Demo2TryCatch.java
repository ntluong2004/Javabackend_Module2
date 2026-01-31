package chapter10_exception;

import static java.lang.Integer.parseInt;

public class Demo2TryCatch {
    static void main() {

//        String str;
//
//        Scanner input = new Scanner(System.in);
//
//        str = input.nextLine();

        try {

            String str = null;
            str.length();

            int x = parseInt("123");
            System.out.println(1 / 0);

            System.out.println("continue try block");
        } catch (NumberFormatException e) {
            System.out.println("Error: number format!!!");
        } catch (ArithmeticException e) {
            System.out.println("Defining 0");
        } catch (NullPointerException e) {
            System.out.println("Handling with null object");
        } catch (Exception e) {
            System.out.println("System error");
        } finally {
            System.out.println("Finish try-catch block");
        }

        System.out.println("Program end with no error");
    }

}
