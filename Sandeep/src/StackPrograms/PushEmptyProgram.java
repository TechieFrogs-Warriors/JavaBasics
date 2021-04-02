package StackPrograms;

import java.util.*;

public class PushEmptyProgram {
    public static void main(String[] args) {
        // creating an instance of Stack class
        Stack<Integer> s = new Stack<>();

        // checking stack is empty or not by using the empty() method
        boolean result = s.empty();
        System.out.println("Is the stack empty? " + result);

        // pushing elements into stack
        s.push(78);
        s.push(113);
        s.push(90);
        s.push(120);

        System.out.println("Elements in Stack: " + s);

        // checking stack is empty or not by using the empty() method
        result = s.empty();
        System.out.println("Is the stack empty? " + result);
    }
}
