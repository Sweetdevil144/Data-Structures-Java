package DataStructures;

import java.util.Calendar;
import java.util.Stack;

public class Stacks {
    public static <Stacks> void main(String[] args) {
        // stacks = LIFO (Last in first out) type Data Structure
        //          stores objects in sort of vertical tower
        //          push() to add to the top
        //          pop() to remove from the top

        // Declaration :
        Stack<String> stack = new Stack<String>();
        stack.push("("); // index = 6
        stack.push(")"); // index = 5
        stack.push("["); // index = 4
        stack.push("]"); // index = 3
        stack.push("{"); // index = 2
        stack.push("}"); // index = 1
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);
//         Extracting the last element before popping.
//        String finalGame = stack.pop();
//        System.out.println(finalGame);
//        System.out.println(stack);
//        We can do the same without removing the item using stack.peek() method
        System.out.println(stack.peek());
        // Return Element at Top of Stack. That is, the last input element in stack.
        System.out.println(stack);
        System.out.println(stack.search("("));
        // Return index of elements we are searching for

// ()[]{}

//        Uses:
//        1- Backtracking Algorithms (maze, directory navigation)
//        2- Calling functions
    }
}
