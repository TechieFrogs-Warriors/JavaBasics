package ArrayListPrograms;

import java.util.*;

public class Program17 {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("B");
        lst.add("C");
        lst.add("A");
        Iterator<String> i = lst.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            lst.add("D");
        }
    }

}
