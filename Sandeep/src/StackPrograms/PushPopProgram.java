package StackPrograms;

import java.util.*;

public class PushPopProgram {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();

        // Use push() method to add elements
        s.push(10);
        s.push(15);
        s.push(30);
        s.push(20);
        s.push(5);

        // Displaying the Stack
        System.out.println("Initial Stack: " + s);

        // Removing elements using pop() method
        System.out.println("Popped element is :: " + s.pop());
        System.out.println("Popped element is :: " + s.pop());

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation " + s);

    }
}
