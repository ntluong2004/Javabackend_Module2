package chapter8_generic_stack_queue.stack_exercise;

public class Main {
    static void main() {

        MyStackWithArrayList stack = new MyStackWithArrayList(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.isEmpty();
    }
}
