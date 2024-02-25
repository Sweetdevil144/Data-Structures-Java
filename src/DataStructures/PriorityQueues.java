package DataStructures;

import java.util.*;

public class PriorityQueues {
    public static void main(String[] args) {
        priorityQueues();
    }
    public static void priorityQueues() {
        // Priority Queues = FIFO data structure (First in, First out)
        //                   that serves elements with the highest priorities first
        //                   before elements with lower priority.
        //      add = enqueue, offer(), add(e)
        //      remove = dequeue, poll(), remove(e)
        //      examine = element(), peek()

        Queue<Double> queue1 = new LinkedList<Double>();
//        Queue<Double> queue2 = new PriorityQueue<Double>(Collections.reverseOrder());
        Queue<Double> queue2 = new PriorityQueue<Double>();
        queue1.offer(9.8);
        queue1.offer(7.84);
        queue1.offer(6.76);
        queue1.offer(7.26);
        queue1.offer(9.0);

        System.out.println(queue1);

        queue2.offer(9.8);
        queue2.offer(7.84);
        queue2.offer(6.76);
        queue2.offer(7.26);
        queue2.offer(9.0);
        System.out.println(queue2);
    }
}
