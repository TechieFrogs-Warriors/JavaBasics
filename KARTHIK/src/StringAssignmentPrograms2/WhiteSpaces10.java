package StringAssignmentPrograms2;

import java.util.Scanner;

public class WhiteSpaces10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String Str1=scan.nextLine();
        Str1=Str1.replace(" ", "");
        System.out.println("Replacement String is: "+Str1);
        scan.close();
    }
    
}
