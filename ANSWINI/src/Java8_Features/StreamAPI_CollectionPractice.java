package Java8_Features;

import java.util.*;

public class StreamAPI_CollectionPractice 
{
    public static void main(String[] args) 
    {
        //creating Arraylist object
        List<String> lst = new ArrayList<>();
        lst.add("b");
        lst.add("c");
        lst.add("a");
        lst.add("d");
        lst.add("f");
        lst.add("e");
        lst.add("b");
        lst.add("f");
        lst.add(null);

        //To find the size of arraylist using stream API using count()
        long count = lst.stream().count();
        System.out.println(count);
        
        //To find the distinct elements of arraylist using stream API using distinct()
        System.out.println("Distinct elements from the list: ");
        lst.stream().distinct().forEach(x->{System.out.println(x);});

        //To iterate through arraylist using stream API using foreach(lambda expression)
        System.out.println("Arraylist elements are: ");
        lst.stream().forEach(x->{System.out.println(x);});

        //To remove nulls's from arraylist using filter(lamda expression)
        System.out.println("After removing nulls from Arraylist elements are: ");
        lst.stream().filter(x->x!=null).forEach(x->{System.out.println(x);}); 

        //To print ascending order of arralist elements using sorted()
        System.out.println("Ascending order of Arraylist elements are: ");
        //if you dont give filter for null values then null-pointer exception is thrown
        lst.stream().filter(x->x!=null).sorted().forEach(x->{System.out.println(x);}); 

        //To print descending order of arralist elements using sorted(collections.reverseorder())
        System.out.println("Descending order of Arraylist elements are: ");
        //if you dont give filter for null values then null-pointer exception is thrown
        lst.stream().filter(x->x!=null).sorted(Collections.reverseOrder()).forEach(x->{System.out.println(x);}); 

        
    }
    
}
