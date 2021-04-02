package ArrayListPrograms;

import java.util.*;

// extending the class to arryalist since removeRange()
// is a protected method
public class Program31 extends ArrayList<Integer> {
    public static void main(String[] args) {
        Program31 list = new Program31();

        // use add() method to add values in the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(12);
        list.add(9);
        list.add(13);

        // prints the list before removing
        System.out.println("The list before using removeRange method is :: " + list);

        // this removeRange() method will remove the data from the give start and end
        // range positions i.e index values
        list.removeRange(0, 3);

        System.out.println("The list after using removeRange:" + list);
    }
}
