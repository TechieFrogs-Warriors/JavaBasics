package StringAssignmentPrograms2;

import java.util.Scanner;

public class LongestRepeatSequence8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter String:");
        String str1 = scan.nextLine();
        String str2 = "";
        int len=str1.length();
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                String str3 = Longest(str1.substring(i, len),str1.substring(j,len));
                if(str3.length()>str2.length())
                {
                    str2=str3;
                }
            }
        }
        System.out.println(str2);
        scan.close();
    }
    public static String Longest(String str1,String str2){
        int n= str2.length();
       for(int i=0;i<n;i++){
           char ch1 =str1.charAt(i);
           char ch2 =str2.charAt(i);
           if(ch1!=ch2){
               return str1.substring(0, i);
           }
       }
       return str1.substring(0, n);
    }
    
}
