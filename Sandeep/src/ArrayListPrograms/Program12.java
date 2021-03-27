package ArrayListPrograms;

//removing elemnts in the ArrayList
import java.util.*;

public class Program12 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// creating arraylist
        list.add("Sai sandeep");// adding the iteams in the array list
        list.add("Answini");
        list.add("Chandra");
        list.add("Karthik");
        list.add("Kalyani");
        list.add("kumar");
        list.add("krishna");
        list.add("Naveen");
        list.add("Anuradha");

        System.out.println("List of elemnts :: " + list);

        // removing specific elemnt from the array list
        list.remove("kumar");
        System.out.println("\nAfter Removing a elemt from the ArrayList :: " + list);

        // now removing the element based on the sepicfic position i.e index value
        list.remove(5);
        System.out.println("\nAfter removing value based on spicific position :: " + list);

    }
}
