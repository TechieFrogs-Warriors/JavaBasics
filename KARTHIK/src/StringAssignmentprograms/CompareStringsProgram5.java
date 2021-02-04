package StringAssignmentprograms;

import java.util.Scanner;

//Java Program to Compare Strings using ==
public class CompareStringsProgram5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String Str1=scan.nextLine();
        String Str2=scan.nextLine();
        if(Str1==Str2){
            System.out.println("Strings are Same");
        }
        else{
            System.out.println("Strings are not Same");
        }
       scan.close(); 
    }
}
