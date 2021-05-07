package InterViewCoddingQuestions;

import java.util.*;

public class StackUsingTwoQueues {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        Queue<Integer> q = new LinkedList<>(s);

        s.add(20);
        s.add(40);
        s.add(70);
        s.add(50);
        s.add(90);
        s.add(110);
        s.add(30);

        System.out.println("Removed Element is :: " + s.pop());

        s.push(170);

        System.out.println(s);

        System.out.println("Removed Element is :: " + s.pop());
    }
}
