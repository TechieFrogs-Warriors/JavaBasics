//iterating the array list using the for-each loop
package ArrayListPrograms;

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// creating arraylist
        list.add("Sai sandeep");// adding the iteams in the array list
        list.add("Answini");
        list.add("Chandra");
        list.add("Karthik");
        list.add("Kalyani");

        // travesring arrylist using the for-each loop
        for (String names : list) {
            System.out.println(names);
        }
    }
}
