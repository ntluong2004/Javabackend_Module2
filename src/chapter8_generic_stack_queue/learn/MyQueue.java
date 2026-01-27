package chapter8_generic_stack_queue.learn;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    static void main() {
        Queue<Integer> integers = new LinkedList<>();

        integers.add(10);
        integers.add(20);
        integers.add(30);

        System.out.println(integers.poll());
        System.out.println(integers.poll());
        System.out.println(integers.poll());

    }
}
