package WiproPrograms;

import java.util.Scanner;

public class UniqueWords 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String Str=InputValidation(scan);
        String words[]=Str.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                
                if(words[i].equals(words[j]))//checks the any repeating words
                {
                    count++;//count will be increamented
                }
            }
        }
        int  finalcount=words.length-(2*count);//repeating count is subtracted from length of array
        System.out.println("Number of Non-repeating words are "+finalcount);
    }
    public static String InputValidation(Scanner scan)
    {
        String Str;
        do
        {
            System.out.println("Enter valid String");
            while(!scan.hasNext("[A-Za-z]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                scan.next();
            }
            Str=scan.nextLine();
        
    
        }while(Str==" ");
        return Str;
    }
    
    
}
