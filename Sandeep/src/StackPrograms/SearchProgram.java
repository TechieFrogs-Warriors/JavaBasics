package StackPrograms;

import java.util.*;

public class SearchProgram {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        // pushing elements into Stack
        s.push("Sandeep");
        s.push("Karthik");
        s.push("Answini");
        s.push("Chandra");
        s.push("Kalyani");

        System.out.println("Stack: " + s);

        // Search an element by using the search() method

        System.out.println("\nLocation of given name is :: " + s.search("Answini"));

        System.out.println("\nThe size of the stack is :: " + s.size());
    }
}
