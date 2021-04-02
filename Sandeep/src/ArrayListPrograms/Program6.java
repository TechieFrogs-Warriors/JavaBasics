package ArrayListPrograms;

//sorting of numbers
import java.util.*;

public class Program6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(31);
        list.add(10);
        list.add(55);
        list.add(9);
        list.add(1);
        list.add(28);

        // sorting the list
        Collections.sort(list);

        // traversting the List
        Iterator obj = list.iterator();// getting iterator

        while (obj.hasNext()) {// chaecks till the last value of the iterator
            System.out.println(obj.next());// prints the element and moves to the next elemnt till the last elemnt
        }
    }
}
