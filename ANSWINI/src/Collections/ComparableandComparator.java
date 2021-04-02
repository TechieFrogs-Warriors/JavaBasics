package Collections;

import java.util.*;

public class ComparableandComparator 
{
    public static void main(String[] args) 
    {
        //Normal array
        int[] arr = {5,2,4,1,7,3};
        Arrays.sort(arr); //sorts naturally
        System.out.println("--------------------------------------------------------------------------------------------------");
        //Arraylist
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(2);
        num.add(4);
        num.add(1);
        num.add(7);
        num.add(3);

        Collections.sort(num);
        System.out.println(num);

        System.out.println("-------------------------------------------------------------------------------------------");

        List<Laptop> laplist = new ArrayList<>();
        laplist.add(new Laptop("Dell", 50000));
        laplist.add(new Laptop("hp", 25000));
        laplist.add(new Laptop("Ausus", 45000));
        laplist.add(new Laptop("Lennovo", 15000));
        laplist.add(new Laptop("Apple", 80000));

        //sorting by using  comparable format
        Collections.sort(laplist);
        //printing
        System.out.println(laplist);

        //sorting by using comparatorfromat
        Collections.sort(laplist,Laptop.comp);
        //printing
        System.out.println(laplist);



        
    }
    
}
