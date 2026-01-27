package chapter8_generic_stack_queue.queue_exercise;

/**
 * Xây dựng lớp MyQueue với các chức năng sau.
 * a. add(): thêm
 * b. peek(): lấy ra xem
 * c. poll(): lấy ra xem vào xóa
 * d. isEmpty(): kiểm tra rỗng
 * e. size(): trả về số lượng phần tử
 */
public class MyQueueWithArrayList<E> {

    private E[] elementData;
    private int size;
    private int capacity;
    private final E[] emptyArray = (E[]) new Object[0];

    public MyQueueWithArrayList() {
        elementData = emptyArray;
    }

    // a. add()
    public void add(E newElement) {

        if (elementData == emptyArray) {
            capacity = 10;
            elementData = (E[]) new Object[capacity];
        }

        if (size == capacity) {
            grow();
        }
        elementData[size] = newElement;

        size++;
    }

    // Tách hàm tăng kích thước ra
    private void grow() {

        capacity = (int) (capacity * 1.5) + 1;

        E[] temp = (E[]) new Object[capacity];

        for (int i = 0; i < size; i++) {
            temp[i] = elementData[i];
        }

        elementData = temp;
    }

}

