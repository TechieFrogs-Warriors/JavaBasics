package StringsConcept;

import java.util.Scanner;

public class Program27 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str=scan.nextLine();
        str=str.replace(" ", "");//removing spaces in the string taken intially.
        int len=str.length();

        System.out.println("To what length of strings you want to divide ? ");
        int n=scan.nextInt();
        int n1=len/n;
        //checking whether given string can be equally divided or not
        if(len%n==0)
        {
            for(int i=0;i<n;i++)
            {
                String s=" ";
                for(int j=i*n1;j<n1*(i+1);j++)
                {
                    s=s+str.charAt(j);
                }
                System.out.println(s);
            }
        }
        else
        {
            System.out.println("String can not be splited into equal parts.");
        }
        scan.close();
        
    }

}
