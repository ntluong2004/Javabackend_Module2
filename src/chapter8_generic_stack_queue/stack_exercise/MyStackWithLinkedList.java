package chapter8_generic_stack_queue.stack_exercise;
/**
 * Xây dựng lớp MyStack với các chức năng sau.
 * a. push(): thêm
 * b. peek(): lấy ra xem
 * c. pop(): lấy ra xem và xóa
 * d. isEmpty(): kiểm tra rỗng
 * e. size(): trả về số lượng phần tử
 */
public class MyStackWithLinkedList<E> {
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


    //    a. push(): thêm
    public void push(E value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
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
        return tail.value;
    }

    // * c. pop(): lấy ra xem và xóa
    public E pop() {

        if (head == null) {
            return null;
        }

        E result;

        if (head == tail) {
            result = head.value;
            head = tail = null;
        } else {
            Node currentNode = head;
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }

            result = tail.value;
            currentNode.next = null;
            tail = currentNode;


        }
        size--;

        return result;
    }

    // * d. isEmpty(): kiểm tra rỗng
    //    case 1:
    public boolean isEmpty1() {
        return head == null;
    }

    //    case 2: kém an toàn
    public boolean isEmpty2() {
        return size == 0;
    }

    // * e. size(): trả về số lượng phần tử
    //    case 1:
    public int size1() {
        int count = 0;
        Node currentNode = head;

        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }

        return count;
    }

    //    Case 2: Không an toàn
    public int size2() {
        return size;
    }
}
