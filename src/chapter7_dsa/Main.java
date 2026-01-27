package chapter7_dsa;

public class Main {
    static void main() {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addFirst(40);
        linkedList.addFirst(20);
        linkedList.addFirst(50);

//        linkedList.addFirst("luong");

        System.out.println(linkedList);
        System.out.println(linkedList.lastIndexOf(20));

//        MyArrayList arrayList = new MyArrayList(5);
//        arrayList.add(20);
//        arrayList.add(30);
//        arrayList.add(70);
//        arrayList.add(50);
//        arrayList.add(60);
//        arrayList.add(70);
//        arrayList.add(80);
//        arrayList.removeElement(70);
//
//        System.out.println(arrayList);

    }
}
