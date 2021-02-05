package StringsConcept;

import java.util.Scanner;

public class Program45 
{
    public static void main(String args[]) 
    {  
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST STRING:");
        String first = sc.nextLine(); 
        System.out.println("ENTER SECOND STRING:"); 
        String second = sc.nextLine();
        sc.close();  
        System.out.println("Before swapping"+"\n"+"first string is: " + first + "   second string is:   " + second); 
        //swapping logic 
        first = first + second;  
        second = first.substring(0, first.length() - second.length());  
        first = first.substring(second.length());  
        System.out.println("After swapping"+"\n" +"first string is: " + first + "   second string is:   " + second);
          
    }  
    
}
