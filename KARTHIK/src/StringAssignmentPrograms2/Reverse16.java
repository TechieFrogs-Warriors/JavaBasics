package StringAssignmentPrograms2;

import java.util.Scanner;

public class Reverse16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter string: ");
        StringBuffer Str1=new StringBuffer(scan.nextLine());
        System.out.println("Reverse String is:"+Str1.reverse());
        scan.close();
    }
    
}
