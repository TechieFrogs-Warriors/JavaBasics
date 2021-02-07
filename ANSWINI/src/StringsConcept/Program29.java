package StringsConcept;

import java.util.Scanner;

public class Program29 
{
    public static String Longest(String S,String S1)
    {
        int n= S1.length();
       for(int i=0;i<n;i++)
        {
           char ch =S.charAt(i);
           char ch1 =S1.charAt(i);
           if(ch!=ch1)
            {
               return S.substring(0, i);
            }
        }
       return S.substring(0, n);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        sc.close();
        String str1 = "";
        int m=str.length();
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                String str3 = Longest(str.substring(i, m),str.substring(j,m));
                if(str3.length()>str1.length())
                {
                    str1=str3;
                }
            }
        }
        System.out.println("Longest sequence in the string is: "+str1);
    }
}
