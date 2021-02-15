package ExceptionHandling;

import java.util.Scanner;

public class SumofIntegers1 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        System.out.println("Enter Two Numbers: ");
        Scanner scan=new Scanner(System.in);

        try{
            a=scan.nextInt();
            b=scan.nextInt();
            System.out.println("Sum of the Two Integers: "+(a+b));
        }
        catch(Exception e){
            System.out.println("Enter Integer values");
        }
        scan.close();
    }
}
