package JavaCoding_InterviewQuestions;

import java.util.Scanner;

import TCS_Programs.Validation;
//Finding missing element of an array
public class MissingArrayElement 
{
    public static void main(String[] args) 
    {
        //Reading input from user and validating it
        Scanner sc = new Scanner(System.in);
        int size = Validation.integerValidation(sc);

        //taking integer array
        int[] myArray = new int[size];

        //Entering elements into array
        for (int i=0;i<myArray.length-1; i++)
        {
           myArray[i] = Validation.integerValidation(sc);
        }

        //Step 1...finding sum of 'n' numbers/elements
        int sumOfNnumbers = sumOfNnumbers(size);
 
        //Step 2..finding sum of array elements
        int sumOfElements = sumOfElements(myArray);
 
        //Step 3..finding missing element from array
        int missingNumber = sumOfNnumbers - sumOfElements;
        
        //Printing the missing number
        System.out.println("Missing Number is = "+missingNumber);

        sc.close();

    }

    //Method to calculate sum of 'n' numbers
    public static int sumOfNnumbers(int n)
    {
        int sum = 0;
        for (int i=1;i<=n;i++)
        {
            sum = sum + i; //adding first 'n' numbers till given range(n)
        }
        return sum;
    }
 
    //Method to calculate sum of all elements of array
    public static int sumOfElements(int[] myArray)
    {
        int sum = 0;
        for (int i=0;i<myArray.length; i++)
        {
            sum = sum + myArray[i];
        }
        return sum;
    }
}
