package core_java_made_easy.Collections_Framework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        for (int i=1; i<=20; i++) {
            queue.offer(i);
        }
        System.out.println(queue);
        System.out.println(queue.poll());

        System.out.println(queue.element());
        System.out.println(queue.peek());

    }
}
