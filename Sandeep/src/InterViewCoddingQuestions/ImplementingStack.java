package InterViewCoddingQuestions;

import java.util.*;

public class ImplementingStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        System.out.println("Is Stack is Empty ? " + s.isEmpty());
        // adding elements
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        System.out.println(s);
        // finding the top element
        System.out.println("The top element is :: " + s.peek());

        // removing elements
        s.pop();
        s.pop();
        System.out.println("After removing the elemnts the stack is :: " + s);

        // finding the top element
        s.peek();
        System.out.println("After removing the elements the top element is :: " + s.peek());

        System.out.println("Is Stack is Empty ? " + s.isEmpty());

    }
}
