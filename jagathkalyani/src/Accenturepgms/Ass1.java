package Accenturepgms;
import java.util.Scanner;

public class Ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ,rev="";
        // validation
        do {
            System.out.println("Enetr String: ");
            while (!sc.hasNext("[A-Za-z]*")) {// String Regular expression
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            str = sc.nextLine();
        } while (str.equals(""));
        System.out.println("Enter  String Is valid " + str);
        
        
        str=sc.nextLine();
        int length=str.length();
        for(int i=length-1;i>=0;i--)
        rev=rev+str.charAt(i);
        if(str.equals(rev))
        System.out.println(str +" is a palindrome");
        else
        System.out.println(str + " not a palindrome");
    }


    
}
