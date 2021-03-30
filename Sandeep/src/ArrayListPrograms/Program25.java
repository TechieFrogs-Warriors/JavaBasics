package ArrayListPrograms;

import java.util.*;

public class Program25 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // cheks the ArrayList is empty or not by using the isEmpty() method
        // returns true if the list is emplty else returns flase if the list not empty
        System.out.println(" ArrayList Empty? :: " + list.isEmpty());
        list.add("Sai sandeep");
        list.add("Answini");
        list.add("Chandra");
        list.add("Karthik");
        list.add("Kalyani");
        System.out.println("\nAfter Adding the values into the ArrayList");
        System.out.println("\nArrayList Empty? :: " + list.isEmpty());
    }
}
