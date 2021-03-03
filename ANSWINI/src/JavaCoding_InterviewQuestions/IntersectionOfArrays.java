package JavaCoding_InterviewQuestions;

import java.util.*;

import TCS_Programs.Validation;

//Write a java program to find intersection of two arrays or common elements between the two arrays
public class IntersectionOfArrays 
{
    public static void main(String[] args) 
    {
        //Reading input from user And validating them
        Scanner sc = new Scanner(System.in);

        //take two arrays
        int[] firstArray = new int[Validation.integerValidation(sc)];
        int[] secondArray = new int[Validation.integerValidation(sc)];

        //Reading value into arrays
        for(int i=0;i < firstArray.length;i++)
        {
            firstArray[i] = Validation.integerValidation(sc);
        }
        for(int j=0;j<secondArray.length;j++)
        {
            secondArray[j] = Validation.integerValidation(sc);
        }

        //Passing these arrays to method that performs logic
        intersection_OfArrays(firstArray,secondArray);
        sc.close();
       
    }
    public static void intersection_OfArrays(int[] first,int[] second) 
    {
        int[] intersectArray = new int[first.length]; //Array to store intersecting elements
        int k = 0; //'k' will indicate position to store in result array if common elements are there
        //Loop to check for common elements
        for(int i=0;i<first.length;i++)
        {
            for(int j=0;j<second.length;j++)
            {
                if(first[i] == second[j]) //checking if both array elements are equal
                {
                    intersectArray[k] = first[i]; //if equal placing them in intersection array
                    k++; //incrementing position to store common elements in the intersectArray
                }

            } 
        }
        
        //printing intersecting elements from the array
        for(int i=0;i<k;i++)
        {
            System.out.print("Intersecting elements are: "+intersectArray[i]+" ");
        }

    }
    
}
