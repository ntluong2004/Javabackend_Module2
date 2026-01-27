package chapter8_generic_stack_queue.stack_exercise;

/**
 * Xây dựng lớp MyStack với các chức năng sau.
 * a. push(): thêm
 * b. peek(): lấy ra xem
 * c. pop(): lấy ra xem và xóa
 * d. isEmpty(): kiểm tra rỗng
 * e. size(): trả về số lượng phần tử
 */

public class MyStackWithArrayList {
    private MyArrayList list;

    public MyStackWithArrayList() {
        list = new MyArrayList();
    }

    public MyStackWithArrayList(int capacity) {
        list = new MyArrayList(capacity);
    }

    // a. push(): Thêm
    public void push(int element) {
        list.add(element);
    }

    // b. peek(): Lấy ra xem
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        // Phần tử ở đỉnh là phần tử cuối cùng trong list
        return list.get(list.getSize() - 1);
    }

    // * c. pop(): lấy ra xem và xóa
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int topValue = peek(); // Bước 1: Lấy giá trị ra xem
        list.remove(list.getSize() - 1); // Bước 2: Xóa phần tử đó
        return topValue;
    }

    // d. isEmpty(): Kiểm tra rỗng
    public boolean isEmpty() {
        return list.getSize() == 0;
    }

    // e. size(): Trả về số lượng phần tử
    public int size() {
        return list.getSize();
    }
}
