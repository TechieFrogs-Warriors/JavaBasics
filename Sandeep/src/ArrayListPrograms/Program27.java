package ArrayListPrograms;

import java.util.*;

public class Program27 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Sai");
        list.add("Sandeep");
        list.add("Krishna");
        System.out.println("ArrayList :: " + list);

        // create a new array of type String
        String[] arr = new String[list.size()];

        // convert ArrayList into an array by using toArray() method
        list.toArray(arr);
        System.out.print("Array :: ");

        // access elements of the array
        for (String i : arr) {
            System.out.print(i + " ");
        }
    }

}
