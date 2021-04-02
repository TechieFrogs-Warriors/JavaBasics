package ArrayListPrograms;

import java.util.*;

public class Program24 {
    public static void main(String[] args) {
        ArrayList<String> list = null;
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        System.out.println(list1);
        // throw NullPointerException because the doest contains the values i.e the list
        // is null
        // we cannot reatain the null list into a another list but we can be viseversa
        list1.retainAll(list);
    }

}
