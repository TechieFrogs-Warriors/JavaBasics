package Infosys_Programs;
//How many moves required to make an array to special array(having all same elements)

import java.util.Scanner;

import TCS_Programs.Validation;

public class MakeSpecialArray 
{
    public static int specialArray(int[] originalArray,int x) 
    {
        int count = 0;
        for(int i=0;i<originalArray.length;i++)
        {
            if(x!=originalArray[i])
            {
                count++;
            }
            
        }
        return count;
        
    }
    public static void main(String[] args) 
    {
        //Reading user input after validating them
        Scanner sc = new Scanner(System.in);
        //creating an array
        System.out.println("Enter size of the array");
        int[] originalArray = new int[Validation.integerValidation(sc)];
        //Entering elements into array
        for(int i=0;i<originalArray.length;i++)
        {
            originalArray[i] = Validation.integerValidation(sc);
        }
        
        //creating a variable basing on which all the array elements become same(special array) 
        int x = Validation.integerValidation(sc);

        //calling method that finds minimum moves to make original array to special array
        int minMoves = specialArray(originalArray,x);

        //printing no.moves required to make given array to special array
        System.out.println("Number of moves required to make special Array: "+minMoves);

        sc.close();
        
    }
    
}
