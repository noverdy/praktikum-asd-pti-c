package Pertemuan2LinkedList;/* Dilarang mengimpor library lain */

public class Hackerrank1 {

    public static void main(String[] args) {
        /* Masukkan kode di sini. Selamat mengerjakan! */
        LinkedList<String> list = new LinkedList<>();
        list.addLast("Halo");
        list.addLast("Hai");
        list.addFirst("Test");

        String hasil = list.toString();
        hasil = hasil.replace(' ', '-');
        System.out.println(hasil);
    }
}



/* Jangan ubah kode di bawah ini */

class LinkedList<T> {
    private Node<T> head, tail;
    private int size = 0;

    public LinkedList() {
        this.head = this.tail = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {
            this.head = this.tail = node;
        }
        else {
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }

    public void addLast(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {
            this.head = this.tail = node;
        }
        else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public T getFirst() {
        return this.head.data;
    }

    public T getLast() {
        return this.tail.data;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node<T> temp = this.head;
        while (temp != null) {
            s.append(temp.data);
            if (temp.next != null) s.append(" ");
            temp = temp.next;
        }
        return s.toString();
    }
}

class Node<T> {
    public T data;
    public Node<T> next;

    public Node() {
        this(null);
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}