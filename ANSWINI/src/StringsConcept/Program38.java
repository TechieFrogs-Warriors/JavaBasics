package StringsConcept;

import java.util.Scanner;

public class Program38 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine(); 
        char inp[] = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i=0;i<str.length();i++) 
        {
            for (int j=i+1;j<str.length();j++) 
            {
                if (inp[i] == inp[j]) 
                {
                    if(inp[j]!='0')
                    System.out.print(inp[j]+" ");
                    inp[j]='0';
                    break;
                }
            }
        }
        sc.close();
        
    }
    
}
