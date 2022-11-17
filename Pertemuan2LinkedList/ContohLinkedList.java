package Pertemuan2LinkedList;

import java.util.LinkedList;

public class ContohLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list.isEmpty());
        list.add(73); // nambahin di belakang
        list.addLast(10); // nambahin di belakang
        list.addFirst(90); // nambahin di depan
        System.out.println(list); //ngeprint

        list.removeLast(); // ngehapus di belakang
        System.out.println(list);
        list.removeFirst(); // ngehapus di depan
        System.out.println(list);
    }
}
