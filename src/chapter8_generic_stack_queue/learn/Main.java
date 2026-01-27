package chapter8_generic_stack_queue.learn;

public class Main {
    static void main() {
//      ArrayList<Integer> arrayList = new ArrayList();
        MyArrayList<Integer> arrayList = new MyArrayList(5);
        MyLinkedList<Integer> linkedList = new MyLinkedList();
        MyLinkedList<String> linkedList1 = new MyLinkedList();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addFirst(40);
        linkedList.addFirst(50);

        linkedList1.addFirst("L");
        linkedList1.addFirst("U");
        linkedList1.addFirst("O");
        linkedList1.addFirst("N");
        linkedList1.addFirst("G");

        System.out.println(linkedList1);
    }

}
