package InterViewCoddingQuestions;

import java.util.*;

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        LinkedList<Integer> ls = new LinkedList<>(s);

        ls.push(20);
        ls.push(50);
        ls.push(80);
        ls.push(40);
        ls.push(60);
        ls.push(75);

        System.out.println("remove element from the LinkedList :: " + ls.pop());

        ls.push(10);

        System.out.println(ls);

        System.out.println(ls.peek());
    }
}
