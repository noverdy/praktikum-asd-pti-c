package Pertemuan6Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueContoh {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(14);
        queue.add(20);

        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

    }
}
