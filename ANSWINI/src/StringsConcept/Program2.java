package StringsConcept;
import java.util.*;

public class Program2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String s=sc.nextLine();
        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                if(str[i].compareTo(str[j])>0) 
                {
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("sorted the string lexicographically");
        for(int i=0;i<str.length;i++)
        {
            System.out.print(str[i]+" ");
        }
        sc.close();
        
    }
}
