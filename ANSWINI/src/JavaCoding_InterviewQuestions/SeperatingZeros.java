package JavaCoding_InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

import TCS_Programs.Validation;

//Write a java program to separate zeros from non-zeros in the given array
public class SeperatingZeros 
{
    //validation method
    public static int integerValidation(Scanner sc) 
    {
        int number;
        do
        {
            System.out.println("Please enter your positive integer number");
            while(!sc.hasNextInt())
            {
                System.out.println("Its invalid.please enter again");
                sc.next();
            }
            number = sc.nextInt();
        }while(number < 0);
        
        return number;
        
    }
    public static void main(String[] args) 
    {
        //Reading user input and validating them
        Scanner sc = new Scanner(System.in);
        //take two arrays
        int[] originalArray = new int[Validation.integerValidation(sc)];

        //Reading value into array
        for(int i=0;i < originalArray.length;i++)
        {
            originalArray[i] = integerValidation(sc);
        }
        
        //Logic method placing zeros after nonzero elements
        rightZeroSeperation(originalArray);
        //Logic method placing zeros before nonzero elements
        leftZeroSeperation(originalArray);
        
    }
    public static void rightZeroSeperation(int[] originalArray) 
    {
        //Initializing count to position of first element
        int count = 0 ;
        //checking the originalArray from left to right
        for(int i=0;i<originalArray.length;i++)
        {
            if(originalArray[i] != 0)
            {
                originalArray[count] = originalArray[i];//placing nonzero values first
                count++; //incrementing count(position of storing element)
            }
            
        }
        //Assigning zero to remaining elements (to come at last in the array)
        while(count < originalArray.length)
        {
            originalArray[count] = 0;
            count++;
        }
        //printing the resultant array elements
        System.out.println(Arrays.toString(originalArray));
        
    }
    public static void leftZeroSeperation(int[] originalArray) 
    {
        //Initializing count to position of last element
        int count = originalArray.length-1;
 
        //checking the originalArray from right to left
        for (int i=originalArray.length-1;i >= 0;i--)
        {
            //If originalArray[i] is non-zero
            if(originalArray[i] != 0)
            {
                originalArray[count] = originalArray[i]; //placing non-zero value
                count--; //decrementing count
            }
        }
        //Assigning 0 to remaining elements (at beginning of array)
        while(count >= 0)
        {
            originalArray[count] = 0;
            count--;
        }
        //printing the resultant array elements
        System.out.println(Arrays.toString(originalArray));
    }
}
