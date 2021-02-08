package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticExpression13 {
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter Number: ");
       int a=scan.nextInt();
       try{
           System.out.println("Division Result: "+a/0);
       }
       catch(ArithmeticException e){
           System.out.println("Arithmetic Exception");
           System.out.println(e.getMessage());
       }
       scan.close();
   } 
}
