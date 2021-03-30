package ArrayListPrograms;

import java.util.*;

public class Program30 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(1);

        System.out.println("ArrayList is :: " + list);

        // using indexOf() method we can get the inde postion of the given value
        int position = list.indexOf(3);

        System.out.println("\nThe given element is at  index postion is  :: " + position);

        // using the lastIndexOf() method we can find the last values index postion of
        // the given value
        int lastPosition = list.lastIndexOf(2);
        System.out.println("\nThe given element at the last index postion is :: " + lastPosition);
    }
}
