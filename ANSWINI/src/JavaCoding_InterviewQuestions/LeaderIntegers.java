package JavaCoding_InterviewQuestions;
import java.util.Arrays;
import java.util.Scanner;
import TCS_Programs.Validation;

//Write a java program to find all the leaders in an integer array.
public class LeaderIntegers 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating them
        Scanner sc = new Scanner(System.in);
        //take two arrays
        int[] originalArray = new int[Validation.integerValidation(sc)];
        int[] leadArray = new int[originalArray.length];

        //Reading value into array
        for(int i=0;i < originalArray.length;i++)
        {
            originalArray[i] = Validation.integerValidation(sc);
        }
        //Logic method to find leaders
        findLeaders(originalArray,leadArray);
        sc.close();
        
    }
    public static void findLeaders(int[] originalArray,int[] leadArray) 
    {
        int i,j; //loop variables declaration
        System.out.println("Leader elements are: "+Arrays.toString(originalArray));
        //Logic
        for(i=0;i<originalArray.length;i++)
        {
            boolean leader = true; //intializing leader to be 'true'

            for(j=i+1;j<originalArray.length;j++)
            {
                if(originalArray[j] > originalArray[i]) //comparing one element with all its right elements
                {
                    leader = false; //if next is greater than previous element then false
                    break; //breaking the loop
                    
                }
            }
            if(leader == true) //if leader=true
            {
                System.out.print(originalArray[i]+" "); //printng the leader element
            }
            
        }
        
        
    }
    
}
