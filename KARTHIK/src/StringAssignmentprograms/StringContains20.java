package StringAssignmentprograms;

import java.util.Scanner;

public class StringContains20 {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        
        System.out.println("Enter String1: ");
        String Str1=Scan.nextLine();
        
        System.out.println("Enter String2: ");
        String Str2=Scan.nextLine();
        
        int present=Str1.indexOf(Str2);
       
        if(present==-1){
            System.out.println("String is not Present: "+Str2);
        }
        
        else{
            System.out.println("String is Present: "+Str2);
        }

        Scan.close();
    }
}
