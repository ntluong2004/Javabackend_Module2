package chapter8_generic_stack_queue.queue_exercise;

import com.sun.source.tree.WhileLoopTree;

/**
 * Xây dựng lớp MyQueue với các chức năng sau.
 * a. add(): thêm
 * b. peek(): lấy ra xem
 * c. poll(): lấy ra xem vào xóa
 * d. isEmpty(): kiểm tra rỗng
 * e. size(): trả về số lượng phần tử
 */

public class MyQueueWithLinkedList<E> {

    private class Node {
        private E value;
        private Node next;

        private Node(E value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    // *     a. add(): thêm
    public void add(E value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // * b. peek(): lấy ra xem
    public E peek() {
        if (head == null) {
            return null;
        }
        return head.value;
    }

    // * c. poll(): lấy ra xem vào xóa
    public E poll() {
        if (head == null) {
            return null;
        }

        E result = head.value;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
        return result;
    }

    // * d. isEmpty(): kiểm tra rỗng
    public boolean isEmpty() {
        return head == null;
    }

    // * e. size(): trả về số lượng phần tử
    public int size1() {
        return size;
    }

    //    Case 2: Thua hiệu năng
    public int size2() {
        int count = 0;
        Node currentNode = head;

        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

}
