package StringAssignmentprograms;

import java.util.Scanner;

//Java Program to convert every word of a String to uppercase
public class FirstLetterUpperCase16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=scan.nextLine();
        
        System.out.println("Before: "+str);
        str=str.toUpperCase();
        System.out.println("After: "+str); 

        scan.close();
    }
    
}
