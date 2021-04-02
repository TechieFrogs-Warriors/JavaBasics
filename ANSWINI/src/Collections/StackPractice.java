package Collections;

import java.util.Enumeration;
import java.util.Stack;

public class StackPractice 
{
    public static void main(String[] args) 
    {
        //creating stack(which extends vector class by default)
        Stack<Integer> mystack = new Stack<>();
        //Adding elements into stack
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.add(5);
        mystack.add(6);

        //Iterating through stack elements
        Enumeration e = mystack.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

        //To remove stack element(always last element gets deleted)
        System.out.println(mystack.pop());
    
        //Display the last element of stack
        System.out.println(mystack.peek());

        //To search an element in the stack
        //returns the given number if it is in the stack elements otherwise returns -1
        System.out.println(mystack.search(3));
       
        
    }
    
}
