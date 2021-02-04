package StringAssignmentprograms;

import java.util.Scanner;

//Java Program to Capitalize the first character of the word in a String
public class FirstLetteruppercase15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str1=scan.nextLine();
        
        System.out.println("Before Changes: "+str1);
        String str2=str1.substring(0, 1);
        String str3=str1.substring(1, str1.length());
        
        str2=str2.toUpperCase();
        str3=str3.toLowerCase();
        
        str1=str2.concat(str3);
        System.out.println("After Changes: "+str1);
        
        scan.close();
    }
    
}
