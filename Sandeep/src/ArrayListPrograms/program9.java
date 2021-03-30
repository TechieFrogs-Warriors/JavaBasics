package ArrayListPrograms;

//traversing through arraylist using the forEach() method
import java.util.*;

public class program9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// creating arraylist
        list.add("Sai sandeep");// adding the iteams in the array list
        list.add("Answini");
        list.add("Chandra");
        list.add("Karthik");
        list.add("Kalyani");

        // Iterator<String> obj = list.iterator();
        // in this method we cannot use iterrator
        // this forEach() method is introduced in the java8

        list.forEach(a -> {// here in theis method we use lambda expression
            System.out.println(a);
        });
    }
}
