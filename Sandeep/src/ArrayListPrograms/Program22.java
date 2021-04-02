package ArrayListPrograms;

import java.util.*;

public class Program22 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sai");
        list.add("Chandra");
        list.add("Kalyani");
        list.add("Karthik");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Sai");
        list2.add("Answini");

        // this retainall() method displays the comman elemnts in the both the lists
        // the comman elemnt is stores in the list so only sai will be stord in the list
        // here list2 will no be changed but list will have only the comman values
        // this retains will give true when ever the method is excuted
        list.retainAll(list2);
        System.out.println("iterating the elements after retaining the elements of list2");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(list);
    }

}
