package ArrayListPrograms;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Program18 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> lst = new CopyOnWriteArrayList<String>();
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
