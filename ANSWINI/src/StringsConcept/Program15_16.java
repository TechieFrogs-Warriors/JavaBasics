package StringsConcept;

import java.util.Scanner;

public class Program15_16 
{
    public static void main(String[] args) 
    {
        //program15 capitalizing first character of each word in a string
        //Taking user input
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of multiple words: ");
        s=sc.nextLine();
        sc.close();

        System.out.println("program15");
        // stores each characters to a char array
        char mystr[] = s.toCharArray();
        boolean foundSpace = true;

        for(int i = 0; i < mystr.length; i++) 
        {
            // checking if the array element is a letter
            if(Character.isLetter(mystr[i])) 
            {
                // checking whether space is present before the letter
                if(foundSpace) 
                {
                    // changing the letter into uppercase
                    mystr[i] = Character.toUpperCase(mystr[i]);
                    foundSpace = false;
                }
            }
            else 
            {
                // if the new character is not character
                foundSpace = true;
            }
        }
        // convert the char array to the string
        s = String.valueOf(mystr);
        System.out.println("First letter of every word in the string is capitalized: " + s);


        System.out.println("program16");
        //program16 converting every word of a string to uppercase
        System.out.println("Every word of string in uppercase: "+s.toUpperCase());
    }
    
}
