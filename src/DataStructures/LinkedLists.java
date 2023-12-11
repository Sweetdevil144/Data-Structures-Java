package DataStructures;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        linkedList();
    }
    public static void linkedList() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        // Behaves like that of a stack, that is, append at the start of the list
        list.push(5);
        list.add(3);
        // Append at last of the list, similar to queues.
        list.offer(8);
        // Add and offer are similar.
        list.add(2);
        list.add(2);
        // To remove head, use pop()
//        list.pop();
        // To remove head, use poll() too
//        list.poll();
        // Remove last or first using pollLast & pollFirst, Recommended.
//        list.pollLast();
//        list.pollFirst();
        // Adding a node, that is, an element at an index.
//        list.add(2,9);
        // Removing an element at an index.
//        list.remove(1);
        // To remove objects, we can also pass the object to be removed.
//        For ex:
//        list.remove("E");


        System.out.println(list);

    }
}
