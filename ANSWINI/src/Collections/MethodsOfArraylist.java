package Collections;
import java.util.*;

public class MethodsOfArraylist extends ArrayList<Integer>
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

        //isEmpty()
        System.out.println(numbers.isEmpty());

        //indexOf(object)
        //returns index of element's  occurence or returns -1 if element is not present in the list
        System.out.println(numbers.indexOf(3));
        System.out.println(numbers.indexOf(10));//returns -1 here because 10 is not there in numbers list
        //lastIndexOf(object)
        //returns index of element's last occurence or returns -1 if element is not present in the list
        System.out.println(numbers.lastIndexOf(1));
        System.out.println(numbers.lastIndexOf(10));//returns -1 here because 10 is not there in numbers list

        //remove(index)
        numbers2.remove(3);//removes element at specific position given from the list
        System.out.println(numbers2);
        //removeIf(predicate filter)
        numbers.removeIf(n -> (n % 3 == 0));//removes if the elements in arraylist satifies the filter condition
        System.out.println(numbers);

        ListIterator<Integer> obj = numbers.listIterator(numbers.size());
        while(obj.hasPrevious())
        {
            int num = obj.previous();
            System.out.println(num);
        }
        
        //removerange() is a protected method in a predefined class called "ArrayList" in collections
        //So we have to inherit Arraylist class to acquire its methods
        //first create 
        MethodsOfArraylist obj1 = new MethodsOfArraylist();
        obj1.add(100);
        obj1.add(101);
        obj1.add(102);
        obj1.removeRange(0,1);
        

    }
    
}
