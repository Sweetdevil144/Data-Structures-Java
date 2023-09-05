package DataStructures;

import java.util.*;

public class Queues {
    public static void main(String[] args) {
        queues();
    }
    public static void queues() {
        // Queues = FIFO data structure (First in, First out)
        // A collection designed for holding elements prior to processing Linear data structure.
        //      add = enqueue = offer(), add(e)
        //      remove = dequeue = poll(), remove(e)
        //      examine = element(), peek()

        Queue<String> queue = new LinkedList<String>();
        queue.add("Karen");
        queue.add("Chad");
        queue.add("Steve");
        queue.add("Herald");
//        queue.poll();
//        Removes element without causing an exception.
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.size());
//        Uses :
//        LinkedList, PriorityQueue, Breadth-first Search
    }
}
