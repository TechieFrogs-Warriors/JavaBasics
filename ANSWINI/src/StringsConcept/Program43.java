package StringsConcept;

import java.util.Scanner;

public class Program43 
{
    
    public static void findWords(String input)
    {
        String  words[] = input.split(" ");//dividing words based on space
        System.out.println("number of words in my string are: "+words.length);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string of words");
        String input=sc.nextLine();
        findWords(input);
        sc.close();
    }

}
