package StringsConcept;

import java.util.Scanner;

public class Frequency_Of_characters 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        //array to store frequencies of characters in string
        int freq[] = new int[26];
        //Reading string from user
        System.out.println("Enter a string");
        String str = sc.nextLine();

        //Logic
        for(int i=0;i<str.length();i++)
        {
            //checking uppercase letter occurence
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                freq[str.charAt(i)-65]++;
            }
            //checking lowercase letter occurence
            else if(str.charAt(i)>=97 && str.charAt(i)<=122)
            {
                freq[str.charAt(i)-97]++;
            }
        }
        //printing loop
        for(int i=0;i<freq.length;i++)
        {
            //checking if character has occured atleast once...if so print
            if(freq[i] > 0)
            {
                //printing character and its frequency
                System.out.print((char)(i + 65)+" = "+freq[i]+"  ");
            }
        }


    }
    
}
