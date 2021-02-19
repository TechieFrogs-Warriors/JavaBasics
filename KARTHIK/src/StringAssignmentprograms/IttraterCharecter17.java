package StringAssignmentprograms;

import java.util.Scanner;

//Java Program to Iterate through each characters of the string – using for loop
public class IttraterCharecter17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=scan.nextLine();
        
        System.out.println("Before Iterate:"+str);
        char[] ch=str.toCharArray();
        
        for(int i = 0;i <ch.length; i++) {
            System.out.print(ch[i]+"*");
        }
        
        scan.close();
    }
    
}
