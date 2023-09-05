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
        stack.push("Minecraft"); // index = 5
        stack.push("Doom"); // index = 4
        stack.push("Final Fantasy"); // index = 3
        stack.push("FF7"); // index = 2
        stack.push("God Of War"); // index = 1
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);

//         Extracting the last element before popping.
//        String finalGame = stack.pop();
//        System.out.println(finalGame);
//        System.out.println(stack);

//        We can do the same without removing the item using stack.peek() method
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("Minecraft"));

//        Uses:
//        1- Backtracking Algorithms (maze, directory navigation)
//        2- Calling functions
    }
}
