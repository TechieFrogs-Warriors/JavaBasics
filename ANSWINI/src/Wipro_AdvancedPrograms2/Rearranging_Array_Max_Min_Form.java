package Wipro_AdvancedPrograms2;

import java.util.Arrays;
import java.util.Scanner;

//Rearrange the array such that modified array should consst one max,one min,one max,one min....
public class Rearranging_Array_Max_Min_Form 
{
    public static void main(String[] args) 
    {
        //Reeading user input
        Scanner sc = new Scanner(System.in);

        //Taking array size from user
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        //Taking an array with size
        int[] originalArray = new int[size];

        //Entering elements into array
        for(int i=0;i<originalArray.length;i++)
        {
            originalArray[i] = sc.nextInt();
        }
        //calling method that rearranges the Array
        int[] modifiedArray = reArrange(originalArray);
        //Printing the modified array elements
        System.out.println(Arrays.toString(modifiedArray));

        sc.close();
    }
    public static int[] reArrange(int[] originalArray)
    {
        //length of array
        int length = originalArray.length;
        //initializing index position to max and min
        //size=5..so index will be from 0(first position) to 4(last position). 
        int max_indx = length-1, min_indx = 0; 
  
        //store maximum element of array 
        int max_element = originalArray[length-1] + 1; 
  
        //Loop through array elements 
        for (int i=0;i<length;i++) 
        { 
            //at even index we have to put maximum element
            if (i % 2 == 0) 
            { 
                originalArray[i] += (originalArray[max_indx] % max_element) * max_element; 
                max_indx--; 
            } 
            //at odd index we have to put minimum element 
            else 
            { 
                originalArray[i] += (originalArray[min_indx] % max_element) * max_element; 
                min_indx++; 
            } 
        } 
  
        //array elements back to it's original form 
        for (int i=0;i<length;i++)
        {
            originalArray[i] = originalArray[i] / max_element; 
        } 
        return originalArray;  
        
    }
}
