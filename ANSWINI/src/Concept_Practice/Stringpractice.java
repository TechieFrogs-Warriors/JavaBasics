import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Stringpractice 
{
    void display()
    {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Eneter string");
       // String str=scan.nextLine();
        StringBuilder sb=new StringBuilder(scan.nextLine());
        StringBuilder temp=sb;
        System.out.println("original : "+temp);
        System.out.println("before reverse: "+sb);
      sb.reverse();
      String s = sb.toString();
        System.out.println("after reverse: "+sb);
        if(temp.equals(s))
        {
            System.out.println("palin");
        }
        else
        System.out.println("not palin");

        
        
        
        
    }
    public static void main(String[] args) 
    {
        
        Stringpractice sp=new Stringpractice();
        sp.display();

        
    }
    
}
