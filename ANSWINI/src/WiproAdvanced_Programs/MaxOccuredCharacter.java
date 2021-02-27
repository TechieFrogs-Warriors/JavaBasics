package WiproAdvanced_Programs;

import java.util.Arrays;
import java.util.Scanner;

import TCS_Programs.Validation;

public class MaxOccuredCharacter 
{
    public static void main(String[] args) 
    {
        //Reading input from user and validating them
        Scanner sc = new Scanner(System.in);
        //taking string input
        System.out.println("Enter your string");
        String originalText = Validation.stringValidation(sc);
        originalText = originalText.toLowerCase();

        //calling the method that perform logic to print lexicographical max occuring character 
        System.out.println(getMaxCharacter(originalText));
        sc.close();
        
    }

    //method that implements logic
    public static char getMaxCharacter(String originalText) 
    {
        char[] arrChar = originalText.toCharArray();
        char[] maxChar = new char[originalText.length()];
        
        int max = 0,count=0;
        int k=0; //variable used as length for repeated character's array to avoid zeros

        for(int i=0;i<arrChar.length;i++)
        {
            for(int j=i+1;j<arrChar.length;j++)
            {
                if(arrChar[i] == arrChar[j]) //comparing characters to each other
                {
                    count++; //if equal(repeated) increase count
                }
                if(count>max) //max repeated character
                {
                    max=count;
                    maxChar[k] = arrChar[i]; //if repeate placing that character into maxchar
                    k++;
                }
            }
        }

        //final array that contains repeated characters
        char newMaxChar[] = new char[k]; 
        for(int i=0;i<k;i++)
        {
            newMaxChar[i]=maxChar[i];
        }

        //sort the array
        Arrays.sort(newMaxChar);

        //returning repeated character based on lexiographical order
        return newMaxChar[0];
        
    }
    
}
