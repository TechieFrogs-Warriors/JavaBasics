package AdvancedPrograms;

import java.util.Scanner;

public class SwapWithOutThirdVariabale6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String1: ");
        String Str1=scan.nextLine();
        System.out.println("Enter String2: ");
        String Str2=scan.nextLine();
        System.out.println("Before Swap: "+Str1+" "+Str2);
        Str1=Str1+Str2;
        Str2 = Str1.substring(0, (Str1.length() - Str2.length()));
        Str1 = Str1.substring(Str2.length());
        System.out.println("After Swap: "+Str1+" "+Str2);
        scan.close();
    
    }
}
