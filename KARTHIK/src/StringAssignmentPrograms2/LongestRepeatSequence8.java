package StringAssignmentPrograms2;

import java.util.Scanner;

public class LongestRepeatSequence8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter String:");
        String S2 = scan.nextLine();
        String S3 = "";
        int m=S2.length();
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                String S4 = Longest(S2.substring(i, m),S2.substring(j,m));
                if(S4.length()>S3.length())
                {
                    S3=S4;
                }
            }
        }
        System.out.println(S3);
        scan.close();
    }
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
    
}
