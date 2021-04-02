package ArrayListPrograms;

import java.util.*;

public class Program32 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("ArrayList: " + list);

        ArrayList cpy_list = new ArrayList();
        cpy_list = (ArrayList) list.clone();

        System.out.println("copy ArrayList is: " + cpy_list);
    }
}
