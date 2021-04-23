package Java8_Features;

import java.util.Arrays;
import java.util.OptionalDouble;

//Program to learn methods of stream API in arrays
public class StreamAPI_ArrayPractice 
{
    public static void main(String[] args) 
    {
        //creating and initializing an integer array 
        int[] intArray = {1,2,4,3,5,8,7,9,1,5};


        //stream(Yourarrayname).count() is used To find the size of array
        long arraySize = Arrays.stream(intArray).count();
        System.out.println("Your array size is: "+arraySize);
        //stream(Yourarrayname).sum() is used To find the sum of array
        long arraySum = Arrays.stream(intArray).sum();
        System.out.println("Your array sum is: "+arraySum);
        //stream(Yourarrayname).max() is used To find the max element of array
        long arrayMax = Arrays.stream(intArray).max().getAsInt();
        System.out.println("Your maximum array element is: "+arrayMax);
        //stream(Yourarrayname).min() is used To find the min element of array
        long arrayMin = Arrays.stream(intArray).min().getAsInt();
        System.out.println("Your minimum array element is: "+arrayMin);
        
        
        
        //stream(Yourarrayname).foreach() is used To iterate through the array
        System.out.println("Array elements are: ");
        Arrays.stream(intArray).forEach((x)->{System.out.println(x);});

        //stream(Yourarrayname).distinct() is used To find the unique/distinct elements of array
        System.out.println("Your distinct array elements are: ");
        Arrays.stream(intArray).distinct().forEach(x->{System.out.println(x);});

        //stream(Yourarrayname).sorted() is used To sort elements of array
        System.out.println("Your distinct sorted array elements are: ");
        Arrays.stream(intArray).distinct().sorted().forEach(x->{System.out.println(x);});

        //stream(Yourarrayname).sorted() is used To sort elements of array
        System.out.println("Your Average of distinct sorted array elements are: ");
        OptionalDouble avg = Arrays.stream(intArray).average();
        System.out.println(avg);
        
        //stream(Yourarrayname).filter().foreach() is used To filter(lambda condition) and iterate through the array
        System.out.println("Even elements are: ");
        Arrays.stream(intArray).filter(x->(x%2)==0).forEach(x->{System.out.println(x);});
        
    }
    
}
