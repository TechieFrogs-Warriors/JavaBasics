package StackPrograms;

import java.util.*;

public class StackPeekProggram {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        // pushing elements into Stack
        s.push("Sandeep");
        s.push("Karthik");
        s.push("Answini");
        s.push("Chandra");
        s.push("Kalyani");

        System.out.println("Stack: " + s);

        // Access element from the top of the stack by using the peek() method
        String fruits = s.peek();

        System.out.println("Element at top: " + fruits);
    }
}
