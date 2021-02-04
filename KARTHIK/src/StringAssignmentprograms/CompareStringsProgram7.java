package StringAssignmentprograms;

import java.util.Scanner;

//Java Program to Compare String objects using ==
public class CompareStringsProgram7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String1: ");
        String a=scan.nextLine();
        System.out.println("Enter String2: ");
        String b=scan.nextLine();
        String Str1=new String(a);
        String Str2=new String(b);
        if(Str1 == Str2){
            System.out.println("Strings are Same.");
        }
        else{
            System.out.println("String are not Equal.");
        }
        scan.close();
    }
}
