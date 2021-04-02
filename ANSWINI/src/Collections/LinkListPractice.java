package Collections;
import java.util.*;
public class LinkListPractice 
{
    public static void main(String[] args)
    {
        //creating linkedlist object
        LinkedList<String> myLinkList = new LinkedList<>();

        //Adding elements to linked list
        myLinkList.add("aswini");
        myLinkList.add("achyuth");
        myLinkList.add("vedhansh");
        myLinkList.add("prasad");
        myLinkList.add("raji");
        myLinkList.add("bharat");

        //printing the linkedlist elements using iterator
        Iterator<String> i = myLinkList.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        //To reverse the elements of linkedlist
        Iterator<String> it = myLinkList.descendingIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //creating  another linkedlist object
        LinkedList<String> myLinkList2 = new LinkedList<>();

        //adding mylinklist elements to mylinklist2
        myLinkList2.addAll(myLinkList);
        System.out.println("mylinklist2: "+myLinkList2);

        //Adding element to first and last of mylinklist
        myLinkList.addFirst("Java");
        System.out.println("After adding elements at first : "+myLinkList);
        myLinkList.addLast("Language");
        System.out.println("After adding elements at last : "+myLinkList);

        //Removing elements from linkedlist
        myLinkList2.remove(); //removes randomly
        System.out.println("Empty remove: "+myLinkList2);
        myLinkList2.remove(3);
        System.out.println("Index remove: "+myLinkList2);
        myLinkList2.removeFirst();
        System.out.println("First element remove: "+myLinkList2);
        myLinkList2.removeLast();
        System.out.println("Last element remove: "+myLinkList2);
        myLinkList2.removeFirstOccurrence("vedansh");
        System.out.println("After removing first ocurence of an object: "+myLinkList2);
        myLinkList2.removeLastOccurrence("prasad");
        System.out.println("After removing last ocurence of an object: "+myLinkList2);


    }
    
}
