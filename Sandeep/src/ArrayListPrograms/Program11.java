package ArrayListPrograms;

//adding the elents in the array list
import java.util.*;

public class Program11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// creating arraylist
        list.add("Sai sandeep");// adding the iteams in the array list
        list.add("Answini");
        list.add("Chandra");
        list.add("Karthik");
        list.add("Kalyani");

        // adding elemnets at a sepecific postion using the index value
        list.add(1, "srikanth");
        System.out.println("After adding the elemt at the specifi postion :: " + list);

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("kumar");
        list1.add("krishna");

        // now adding the list1 elements to the list
        list.addAll(list1);
        System.out.println("\nAfer adding the elemnts of list1 to the list :: " + list);

        // now crateing a another list2 to add the list2 in the list at a specific
        // postion
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Naveen");
        list2.add("Anuradha");

        // now adding the list2 int the list at a specific postion
        list.addAll(2, list2);

        System.out.println("\nAfter adding the list2 to the list :: " + list);
    }
}
