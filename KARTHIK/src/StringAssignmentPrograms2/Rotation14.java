package StringAssignmentPrograms2;

import java.util.Scanner;

public class Rotation14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String1: ");
        String str1=scan.nextLine();
        System.out.println("Enter String2: ");
        String str2=scan.nextLine();
        String str3=str1+str1;
        if(str3.contains(str2)){
            System.out.println("String2 is rotation of String1 :"+str2);
        }
        else{
            System.out.println("String2 is not a rotation of String1 :"+str2);
        }
        scan.close();

    }
    
}
