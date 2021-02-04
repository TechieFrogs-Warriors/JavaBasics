package StringAssignmentPrograms2;

import java.util.Scanner;

public class Pallindrom13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String Str=scan.nextLine();
        StringBuffer Str1 =new StringBuffer(Str);
        Str1.reverse();
        String s=Str1.toString();
        if(Str.equals(s)){
            System.out.println("Given String is a Pallindrom");
        }
        else{
            System.out.println("Given Number is not a Pallindrom");
        }
        scan.close();
    }
    
}
