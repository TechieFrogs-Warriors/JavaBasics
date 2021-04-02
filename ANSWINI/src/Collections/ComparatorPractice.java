package Collections;
import java.util.*;

public class ComparatorPractice 
{
    public static void main(String[] args) 
    {

        //creating a list of Laptop type
        List<LaptopComparator> lap= new ArrayList<>();

        //adding values to list by passing the values to the constructor of laptop class
        lap.add(new LaptopComparator("DELL",30000));
        lap.add(new LaptopComparator("LENNOVO",25000));
        lap.add(new LaptopComparator("ASUS",35000));
        lap.add(new LaptopComparator("APPLE",80000));

        //using comparatorinterface here.creating anonymous object for this comparator interface
        Comparator<LaptopComparator> comp = new Comparator<LaptopComparator>()
        {
            //using compare(passing two parameters) method from comparator interface we develop sorting logic
            public int compare(LaptopComparator l1,LaptopComparator l2)
            {
                if(l1.getPrice() > l2.getPrice())
                return 1;
                else return -1;
            }
        };
        //sorting using inbuilt sort method from collections and passing list object and comparator object as parameters to it
        Collections.sort(lap,comp);

        //printing the list in sorted order based on price
        for(LaptopComparator l:lap)
        {
            System.out.println(l);
        }
    }
    
    
}
