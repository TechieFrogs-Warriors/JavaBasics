package ArrayListPrograms;

import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        // ading the values to the array list by using the add() method
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);
        alist.add(5);
        alist.add(6);
        alist.add(7);
        alist.add(8);
        alist.add(9);
        alist.add(10);
        alist.add(11);
        alist.add(12);
        alist.add(13);
        alist.add(14);
        alist.add(15);
        alist.add(16);
        alist.add(17);
        alist.add(18);
        alist.add(19);
        alist.add(20);

        // removing the 19th element from the list
        alist.remove(19);   
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }
    }

}
