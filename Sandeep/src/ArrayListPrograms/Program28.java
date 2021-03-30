package ArrayListPrograms;

import java.util.*;

public class Program28 {
    public static void main(String[] args) {
        String[] arr = { "sai", "sandeep", "krishna" };
        System.out.print("Array :: ");

        // print array elements
        for (String str : arr) {
            System.out.print(str);
            System.out.print(" ");
        }

        // create an ArrayList from an array
        // converting the arry into ArrayList by using asList() method
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("\n\nArrayList :: " + list);

        // in the same way we can connvert arrayList into the strings by using the
        // toString() method
        String str1 = list.toString();
        System.out.println("\nString :: " + str1);
    }

}
