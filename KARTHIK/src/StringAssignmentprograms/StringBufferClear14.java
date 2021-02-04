package StringAssignmentprograms;

import java.util.Scanner;

public class StringBufferClear14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");

        StringBuffer Str=new StringBuffer(scan.nextLine());
        System.out.println("String Is: "+Str);
        
        Str=new StringBuffer();
        System.out.println("Clear String is:"+Str);

        scan.close();
    }
    
}
