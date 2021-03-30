package ArrayListPrograms;

import java.util.*;

public class Program29 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(4);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // use contains() to check if the given value exist or not

        // boolean ans = arr.contains(2);
        boolean ans = list.contains(6);

        if (ans)
            System.out.println("The list contains the given value");
        else
            System.out.println("The list does not contains the given value");
    }

}
