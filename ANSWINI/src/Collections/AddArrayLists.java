package Collections;
import java.util.*;

public class AddArrayLists 
{
    public static void main(String[] args) {
        //creating first arraylist
        List<Integer> numbers = new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
            numbers.add(i);
        }
        System.out.println(numbers);

        //creating second arraylist
        List<Integer> numbers2 = new ArrayList<>();
        for(int i=10;i<=15;i++)
        {
            numbers2.add(i);
        }
        System.out.println(numbers2);

        //Adding two(first and second) arraylists (normally second arraylist gets added at last of first arraylist elements
        numbers.addAll(numbers2);
        System.out.println(numbers);
        //Adding first list in the second list at a specific index/position
        numbers2.addAll(2,numbers);
        System.out.println(numbers2);

        

       
    }
    
}
