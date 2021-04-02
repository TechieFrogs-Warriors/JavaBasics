package ArrayListPrograms;

import java.util.*;

public class Program23 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        System.out.println(list1);

        System.out.println(list1.retainAll(list));
        System.out.println(list1);
    }

}
