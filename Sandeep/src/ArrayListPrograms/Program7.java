package ArrayListPrograms;
//traversing through list iterator

import java.util.*;

public class Program7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// creating arraylist
        list.add("Sai sandeep");// adding the iteams in the array list
        list.add("Answini");
        list.add("Chandra");
        list.add("Karthik");
        list.add("Kalyani");

        System.out.println("------ traversing arraylist through List Iterator -------");

        // in this the elemnts iterate in a reverse order
        ListIterator<String> obj = list.listIterator(list.size());
        while (obj.hasPrevious()) {// check if the element is present befor the elemnt position

            String str = obj.previous();
            // here we cannot print the value using the object so assing the value to the
            // variable

            System.out.println(str);
        }
    }
}
