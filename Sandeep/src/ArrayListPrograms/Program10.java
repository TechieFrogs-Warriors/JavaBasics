package ArrayListPrograms;

//traversing through forEachReamaining() method
import java.util.*;

public class Program10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// creating arraylist
        list.add("Sai sandeep");// adding the iteams in the array list
        list.add("Answini");
        list.add("Chandra");
        list.add("Karthik");
        list.add("Kalyani");

        Iterator<String> obj = list.iterator();

        obj.forEachRemaining(a -> {
            System.out.println(a);
        });
    }
}
