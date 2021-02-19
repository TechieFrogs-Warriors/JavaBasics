package StringsConcept;

import java.util.Scanner;

public class Program35 
{
    //program to find whether one string is rotation of another string
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String s1=sc.nextLine();
        System.out.println("Enter second string");
        String s2=sc.nextLine();
        sc.close();
        s1=s1+s1;
        System.out.println(s1);
        if(s1.contains(s2))
        {
            System.out.println("second string is rotation of first");
        }
        else
        {
            System.out.println("second string is NOT rotation of first");

        }
    }
    
}
