package chapter8_generic_stack_queue.learn;

import java.util.Stack;

public class StackLearning {
    static void main() {

        Stack<Integer> stack = new Stack<>();

        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

//        System.out.println(stack.size());

//        for (int i = stack.size(); i > 0; i++) {
//            System.out.println(stack.pop());
//        }

//        int size = stack.size();
//        for (int i = 0; i < size; i++) {
//            System.out.println(stack.pop());
//        }
    }
}
