package ExceptionHandling;

import java.util.Scanner;

public class FinallyBlock25 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=scan.nextInt();
        try{
            if(n>n/0){
                System.out.println("Arthimetic Exception.");
            }
        }
        finally{
            if(n>0){
                System.out.println("Entered Value Is Positive Number.");
                try{
                    int i=n/0;
                    System.out.println("Result "+i);
                }
                catch(ArithmeticException e){
                    System.out.println("Inner Finally Block.");
                    System.out.println(e.getMessage());
                }
            }
        }
        scan.close();
    }
}
