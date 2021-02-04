package StringAssignmentprograms;

import java.util.Scanner;

//Java Program to Clear the StringBuffer
public class StringBufferClear12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        
        StringBuffer Str1=new StringBuffer(scan.nextLine());
        System.out.println("String is:"+Str1);
        
        Str1.delete(0, Str1.length());
        System.out.println("Clear String is: "+Str1);

        scan.close();
    }
    
}
