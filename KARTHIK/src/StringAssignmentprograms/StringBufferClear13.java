package StringAssignmentprograms;

import java.util.Scanner;

//Java Program to Clear the StringBuffer using setLength() method
public class StringBufferClear13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        
        StringBuffer Str=new StringBuffer(scan.nextLine());
        System.out.println("String is: "+Str);
        
        Str.setLength(0);
        System.out.println("Clear String is:"+Str);

        scan.close();
    }
    
}
