package WiproAdvanced_Programs;

import java.util.Scanner;

import TCS_Programs.Validation;

public class RotateArrayLeft 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating that input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int[] N = new int[Validation.integerValidation(sc)] ; //Array

        //Taking elements into array
        System.out.println("Enter array elements");
        for(int i=0;i<N.length;i++)
        {
            N[i] = Validation.integerValidation(sc);
        }

        //number of times to rotate the array 
        System.out.println("Enter number of left rotations");
        int D = Validation.integerValidation(sc); 

        //calling method that perform logic to rotate left
        rotateArr(N, D);

        sc.close();

    }

    public static void rotateArr(int[] N, int D) 
    {
        //Loop to rotate no.of times(here D)
        for (int i = 0; i < D; i++)
        {
            rotation( N ,  D); //calling the logic method which performs rotation
        }

        //printing output after 2 times left rotation
        System.out.println("Elements after left rotation of array: ");
        for(int i=0;i<N.length;i++)
        {
            System.out.print(N[i]+" ");
        }
        
    }
    //Method that implements logic for rotation
    public static void rotation(int[] N , int D )
    {
        int i,temp = N[0]; //placing first element in temporary variable
        for(i=0;i<N.length-1;i++)
        {
            N[i] = N[i+1]; //placing next position element to first position
            
        }
        N[N.length-1] = temp; //placing temporary value at the last of the array

    }
    
}
