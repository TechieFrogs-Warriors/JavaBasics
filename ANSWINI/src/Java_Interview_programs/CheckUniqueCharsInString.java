package Java_Interview_programs;

import java.util.HashSet;

//Program to find unique characters in the string or not?
public class CheckUniqueCharsInString 
{
    //Logic method to check if the word has unique characters
    public static boolean hasAllUniqueChars(String word)
    {
        HashSet<Character> checkchar = new HashSet<>();
        for(int i=0;i<word.length();i++)
        {
            char c = word.charAt(i);
            // If Hashset's add method return false,that means it is already present in HashSet
            if(!checkchar.add(c))
            return false;
        }
        return true;//if unique
    }

    //Another logic to find unique characters in string
    public static boolean hasAllUniqueChars2(String word) 
    {
 
        for(int i=0;i < word.length(); i ++)   
        {
    
            char c =word.charAt(i);
            //just comparing with its last occurence by index.if the character exists already it will have lastindex 
            //our requirement is the character shouldn't be present to be unique
            if(word.indexOf(c) != word.lastIndexOf(c))
            {
                return false;

            }    
        }
        return true;
    }
    //Driver class
    public static void main(String[] args) 
    {
        //checking with first logic method
        System.out.println("Does 'madam' has unique charcters in it? : "+hasAllUniqueChars("madam"));
        System.out.println("Does 'water' has unique charcters in it? : "+hasAllUniqueChars("water"));

        //checking with second logic method
        System.out.println("Does 'madam' has unique charcters in it? : "+hasAllUniqueChars2("madam"));
        System.out.println("Does 'water' has unique charcters in it? : "+hasAllUniqueChars2("water"));
        
    }
    
}
