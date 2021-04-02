package ArrayListPrograms;

//Get and Set ArrayList
import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// creating arraylist
        list.add("Sai sandeep");// adding the iteams in the array list
        list.add("Answini");
        list.add("Chandra");
        list.add("Karthik");
        list.add("Kalyani");

        // accessing the elemnts in the list based on the index vales of arraylist

        System.out.println("the name is :: " + list.get(0));

        // modifiying the elemnts based on the index vale by using set method

        list.set(0, "Sai sandeep M");

        // traversting the List
        Iterator obj = list.iterator();// getting iterator

        while (obj.hasNext()) {// chaecks till the last value of the iterator
            System.out.println(obj.next());// prints the element and moves to the next elemnt till the last elemnt
        }
    }
}
