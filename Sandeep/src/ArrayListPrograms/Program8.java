package ArrayListPrograms;

//tarvesing the arraylist using the for loop
import java.util.*;

public class Program8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// creating arraylist
        list.add("Sai sandeep");// adding the iteams in the array list
        list.add("Answini");
        list.add("Chandra");
        list.add("Karthik");
        list.add("Kalyani");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
