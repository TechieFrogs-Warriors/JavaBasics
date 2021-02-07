package StringsConcept;

import java.util.Scanner;

public class Program17_18 
{
    public static void main(String[] args) 
    {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: "+"\n");
        name=sc.nextLine();
        sc.close();
        
        System.out.println("program17");
        //program 17
        // for loop
        for(int i = 0; i<name.length(); i++) 
        {
          char a = name.charAt(i);
          System.out.print(a+",");
        }
        System.out.println("\n"+"program18");
        //program 18
        // using for-each loop
        for(char c : name.toCharArray()) 
        {
            System.out.print(c+",");
        }
    }
    
}
