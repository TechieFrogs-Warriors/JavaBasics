package TcsPrograms;

import java.util.Scanner;

public class StringOPerations 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String Word=InputValidation(scanner);
        String Word1=InputValidation(scanner);
        String Word2=InputValidation(scanner);
        Word=Word.replaceAll("[aeiouAEIOU]","%");//replaces all vowels with %
        Word1=Word1.replaceAll("[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z]", "#");//replaces all Consonents with #
        Word2=Word2.toUpperCase();//Converts all the characters to UpperCase
        String Sentence=Word+Word1+Word2;//All three strings are concatenated
        System.out.println(Sentence);

        
    }
    public static String InputValidation(Scanner scanner)
    {
        String Str;
        do
        {
            System.out.println("Enter valid number");
            while(!scanner.hasNext("[A-Za-z]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                scanner.next();
            }
            Str=scanner.nextLine();
        
    
        }while(Str.equals(""));
        return Str;
    }
    
    
}
