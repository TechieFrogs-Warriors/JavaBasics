//Iterating arraylist using iterator

package ArrayListPrograms;

import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// creating arraylist
        list.add("Sai sandeep");// adding the iteams in the array list
        list.add("Answini");
        list.add("Chandra");
        list.add("Karthik");
        list.add("Kalyani");

        // traversing list through iterator
        Iterator obj = list.iterator();// getting iterator

        while (obj.hasNext()) {
            // list.remove("Kalyani");
            System.out.println(obj.next());// prints the element and moves to the next elemnt till the last element
        }
    }
}
