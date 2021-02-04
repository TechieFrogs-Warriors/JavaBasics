package StringAssignmentprograms;

import java.util.Scanner;

//Java Program to Check if a string contains a substring using contains()
public class StringContains19 {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        
        System.out.println("Enter String1: ");
        String Str1=Scan.nextLine();
        
        System.out.println("Enter String2: ");
        String Str2=Scan.nextLine();
       
        boolean present=Str2.contains(Str1);
        
        if(present){
            System.out.println("String is Present: "+Str2);
        }
        
        else{
            System.out.println("String is not Present: "+Str2);
        } 
        
        Scan.close();
    }
    
}