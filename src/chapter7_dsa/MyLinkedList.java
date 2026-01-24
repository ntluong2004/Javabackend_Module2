package chapter7_dsa;

import java.util.NoSuchElementException;

/**
 * Xây dựng lớp MyLinkedList với các chức năng sau:
 * a. addFirst (int element)
 * b. toString (): Trả về thông tin đối tượng
 * c. addLast (int element)
 * d. add (int index, int element)
 * e. removeFirst ()
 * f. removeLast ()
 * g. remove (int index)
 * h. getFirst ()
 * i. getLast ()
 * j. get (int index)
 * k. set (int index, int element)
 * l. indexOf (int element)
 * m. lastIndexOf (int element)
 */

public class MyLinkedList {
    private static class Node {
        int value;

        Node next; //default null

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    private Node tail;

    private int size;

    // *     a. addFirst (int element)
    public void addFirst(int element) {
        Node nodeNew = new Node(element);

        if (head == null) {
            head = tail = nodeNew;
        } else {
            nodeNew.next = head;
            head = nodeNew;
        }
        size++;
    }

    //    b. toString (): Trả về thông tin đối tượng
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Node temp = head;

        for (int i = 0; i < size; i++) {
            stringBuilder.append(temp.value).append("\t");
            temp = temp.next;
        }

        return stringBuilder.toString();
    }

    //    c. addLast (int element)
    public void addLast(int element) {
        Node nodeNew = new Node(element);

        if (head == null) {
            head = tail = nodeNew;
        } else {
            tail.next = nodeNew;
            tail = nodeNew;
        }
        size++;
    }

    //    d. add (int index, int element)
    public void addToIndex(int index, int element) {
        Node nodeNew = new Node(element);

        if (index < 0 || index > size) {
            System.out.println("Error: Index > size");
        } else if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            nodeNew.next = temp.next;
            temp.next = nodeNew;

            size++;
        }
    }

    //    e. removeFirst ()
    public void removeFirst() {

        if (head == null) {
            throw new NoSuchElementException("Cannot remove from an empty list!");
        }

        head = head.next;
        size--;

        if (size == 0) {
            tail = null;
        }
    }

    //    f. removeLast ()
    public void removeLast() {
        if (head == null) {
            throw new NoSuchElementException("Cannot remove from an empty list!");
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {

            Node current = head;

            while (current.next != tail) {
                current = current.next;
            }

            current.next = null;
            tail = current;
        }

        size--;
    }

    //    g. remove (int index)
    public void remove(int index) {
        if (index > size - 1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            removeFirst();
            return;
        } else {
            Node preNode = head;

            for (int i = 0; i < index - 1; i++) {
                preNode = preNode.next;
            }

            Node nodeToRemove = preNode.next;
            preNode.next = nodeToRemove.next;

            if (nodeToRemove == tail) {
                tail = preNode;
            }
        }

        size--;
    }

    // h. getFirst ()
    public int getFirst() {
        if (head == null) {
            throw new NoSuchElementException("Empty list");
        }
        return head.value;
    }

    //    i. getLast ()
    public int getLast() {
        if (head == null) {
            throw new NoSuchElementException("Empty list");
        }

//        case 1
//        Node currentNode = head;
//        for (int i = 0; i < size - 1; i++) {
//            currentNode = currentNode.next;
//        }
//        return currentNode.value;

//        case
        return tail.value;
    }

//    j. get (int index)

    public int get(int index) {
        if (head == null) {
            throw new NoSuchElementException("Empty list");
        }
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        } else {

            Node currentNode = head;

            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.value;
        }
    }

    //    k. set (int index, int element)
//   Case 1
    public void set1(int index, int element) {
        Node temp = getNode(index);
        temp.value = element;
    }

    private Node getNode(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }

        Node currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    //    k. set (int index, int element)
//    case 2
    public void set2(int index, int element) {
        if (index < 0 || index > size - 1) {
            throw new NoSuchElementException("IndexOutOfBoundsException");
        }
        if (size == 1) {
            head.value = element;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            currentNode.value = element;
        }
    }

    //    l. indexOf (int element)
    public int indexOf(int element) {
        if (head == null) {
            return -1;
        }

        Node currentNode = head;

        for (int i = 0; i < size; i++) {
            if (currentNode.value == element) {
                return i;
            }
            currentNode = currentNode.next;
        }

        return -1;
    }

    //    m. lastIndexOf (int element)
    public int lastIndexOf(int element) {
        Node currentNode = head;
        int lastIndex = -1;

        for (int i = 0; i < size; i++) {
            if (currentNode.value == element) {
                lastIndex = i;
            }
            currentNode = currentNode.next;
        }

        return lastIndex;
    }
}
