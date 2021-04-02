package ArrayListPrograms;

//sorting of arraylist
import java.util.*;

public class Program5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// creating arraylist
        list.add("Sai sandeep");// adding the iteams in the array list
        list.add("Answini");
        list.add("Chandra");
        list.add("Karthik");
        list.add("Kalyani");

        // sorting the list by using the sort method
        Collections.sort(list);

        // traversting the List
        Iterator obj = list.iterator();// getting iterator

        while (obj.hasNext()) {// chaecks till the last value of the iterator
            System.out.println(obj.next());// prints the element and moves to the next elemnt till the last elemnt
        }
    }
}
