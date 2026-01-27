package chapter8_generic_stack_queue.learn;

import java.util.Stack;

public class StackLearning2 {
    static void main() {
        Stack<Integer> stack = new Stack<>();

        int n = 6;

        while (n != 0) {
            stack.add(n % 2);
            n /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
