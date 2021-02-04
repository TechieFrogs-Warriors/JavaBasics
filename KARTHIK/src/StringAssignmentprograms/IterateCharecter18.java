package StringAssignmentprograms;

import java.util.Scanner;

//Java Program to Iterate through each characters of the string – using for-each loop
public class IterateCharecter18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str1=scan.nextLine();
        
        System.out.println("Before Iterate: "+str1);
        char[] ch=str1.toCharArray();
        
        for(char ch1 : ch){
            System.out.print(ch1+"* ");
        }
        
        scan.close();
    }
    
}
