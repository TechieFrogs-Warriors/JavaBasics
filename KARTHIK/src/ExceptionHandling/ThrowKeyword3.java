package ExceptionHandling;

import java.util.Scanner;

public class ThrowKeyword3 {
    public static void main(String[] args) {
        System.out.println("Enter Money: ");
        Scanner scan=new Scanner(System.in);
        Margin(scan.nextInt());
        System.out.println("Thank You.");
        scan.close();
    }
    static void Margin(int a){
        if(a<100){
            throw new ArithmeticException("Please Enter Above 100 rupess.");
        }
        else{
            System.out.println("Entering Amount is Processed.");
        }
    }
}
