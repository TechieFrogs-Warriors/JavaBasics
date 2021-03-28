package ArrayListPrograms;

import java.util.*;

public class Program20 {
    public static void main(String[] args) {
        List<String> alist = new ArrayList<>();
        // adding the elemts in the list using the add() method
        alist.add("Sai sandeep");
        alist.add("Answini");
        alist.add("Chandra");
        alist.add("Karthik");
        alist.add("Kalyani");
        alist.add("Sai sandeep");
        alist.add("Answini");
        alist.add("Chandra");
        alist.add("Karthik");
        alist.add("Kalyani");

        // here we are using the Iterator to print the vales in the array list
        Iterator obj = alist.iterator();

        while (obj.hasNext()) {
            System.out.println(obj.next());// prints the element and moves to the next elemnt till the last element
        }

    }

}
