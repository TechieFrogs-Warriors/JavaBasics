package StringsConcept;

import java.util.Scanner;

public class Program31_33 
{
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        //program 31.removing spaces in a string
        System.out.println("ENTER YOUR STRING WITH SPACES");
        String s1 = sc.nextLine();
        System.out.println("Original string is: " + s1);
        s1 = s1.replaceAll("\\s", "");//using replaceAll method
        System.out.println("After replacement string: " + s1);


        //program 33.replacing space with special character
        System.out.println("ENTER YOUR SECOND STRING FOR PROGRAM 33");
        String s2=sc.nextLine();
        System.out.println("Original string is: " + s2);
        System.out.println(s2.replace(' ', '^'));//using replace char method.we cana lso use replaceAll
        sc.close();
    }
    
}
