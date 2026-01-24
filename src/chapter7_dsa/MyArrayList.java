package chapter7_dsa;

/**
 * Xây dựng lớp MyArrayList với các chức năng sau:
 * a. add (int element): Thêm phần tử element vào cuối.
 * b. toString (): Trả về thông tin đối tượng
 * c. add (int index, int element): Thêm phần tử vào vị trí index
 * d. set (int index, int element): Thay thế phần tử tại vị trí index
 * e. get (int index): Trả về phần tử tại index
 * f. indexOf (int element): Lấy vị trí index phần tử đầu tiên tìm thấy
 * g. lastIndexOf (int element o): Lấy vị trí index phần tử cuối cùng tìm thấy
 * h. remove (int index): Xóa phần tử lại vị trí index
 * i. removeElement (int element): Xóa tất cả phần tử element
 */
public class MyArrayList {

    private int[] elementData;

    private int capacity;

    private int size;

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int[] emptyArray = {};

    public MyArrayList() {
        elementData = emptyArray;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        elementData = new int[capacity];
    }

    //    Problem a
    public void add(int newElement) {
        if (elementData == emptyArray) {
            capacity = 10;
            elementData = new int[capacity];
        }

        if (capacity == size) {
            capacity *= 1.5; //tang size cua mang len 1.5 lan
            if (capacity == size) {
                capacity++; //Tranh truong hop capacity = 1 hoac 0
            }

            int[] temp = new int[capacity];

            for (int i = 0; i < size; i++) {
                temp[i] = elementData[i];
            }

            elementData = temp;
        }

        elementData[size] = newElement;
        size++;
    }


    // Problem b
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            stringBuilder.append(elementData[i]).append("\t");
        }

        return stringBuilder.toString();
    }

    //    problem c
    public void addToIndex(int index, int element) {

        if (index < 0 || index > size) {
            System.out.println("IndexOutOfBoundsException");
            return;
        }

        if (size == capacity) {

            capacity = (capacity == 0) ? 10 : (int) (capacity * 1.5);

            int[] temp = new int[capacity];

            for (int i = 0; i < index; i++) {
                temp[i] = elementData[i];

                temp[index] = element;

                for (int j = index; j < size; j++) {
                    temp[j + 1] = elementData[j];
                }

                elementData = temp;
            }
        } else {
            for (int i = size; i > index; i--) {
                elementData[i] = elementData[i - 1];
            }
            elementData[index] = element;
        }

        size++;
    }

    //    problem d
    public void set(int index, int element) {
        checkIndex(index);
        elementData[index] = element;
    }

    //    e. get (int index): Trả về phần tử tại index
    public int get(int index) {
        checkIndex(index);
        return elementData[index];
    }

    //     * f. indexOf (int element): Lấy vị trí index phần tử đầu tiên tìm thấy
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // * g. lastIndexOf (int element o): Lấy vị trí index phần tử cuối cùng tìm thấy
    public int lastIndexOf(int element) {
        for (int i = size - 1; i >= 0; i--) {
            if (elementData[i] == element) {
                return i;
            }
        }
        return -1;
    }

    //    h. remove (int index): Xóa phần tử lại vị trí index
    public void remove(int index) {
        checkIndex(index);

        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    //     * i. removeElement (int element): Xóa tất cả phần tử element
    public void removeElement(int element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == element) {
                remove(i);
                i--;
            }
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}

