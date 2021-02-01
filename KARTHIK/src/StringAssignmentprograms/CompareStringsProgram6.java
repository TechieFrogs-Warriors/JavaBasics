package StringAssignmentprograms;

import java.util.Scanner;
//Java Program to Compare Strings using equals()
public class CompareStringsProgram6 {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter String1: ");
        String Str1=Scan.next();
        System.out.println("Enter String2: ");
        String Str2=Scan.next();
        if(Str1.equals(Str2)){
            System.out.println("Strings are Same.");
        }
        else{
            System.out.println("Strings are Not Same.");
        }
        Scan.close();
    }
    
}
