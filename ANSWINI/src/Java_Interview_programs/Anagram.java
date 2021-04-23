package Java_Interview_programs;

import java.util.Arrays;

//program to find two strings are anagrams
public class Anagram 
{
    public static void main(String[] args) 
    {
        //taking two Strings to compare for Anagrams
        String firstWord = "java";
        String secondWord = "akav";
        //if length of two strings are not equal..automatically they are not anagrams
        if(firstWord.length()!=secondWord.length())
        {
            System.out.println("Two strings are not anagrams");
        }
        //if lengths of strings are equal then..
        else
        {
            //create object for the class where sorting method is there
            Anagram obj =new Anagram();
            //Taking two strings to store sorted strings
            String sortFirst = obj.sort(firstWord);
            String sortSecond = obj.sort(secondWord);
            //checking if both sorted strings are equal
            if(sortFirst.equals(sortSecond))
            {
                //if equal they are anagrams
                System.out.println("Two strings are anagrams");
            }
            else
            {
                //if not equal they are not anagrams
                System.out.println("Two strings are not anagrams");
            }
        }
        
    }
    //sorting method 
    String sort(String word)
    {
        //converting string to char array
        char[] charr = word.toCharArray();
        Arrays.sort(charr);//sorting the chararray
        return String.valueOf(charr);//converting array to string again and returning it
    }
    
}
