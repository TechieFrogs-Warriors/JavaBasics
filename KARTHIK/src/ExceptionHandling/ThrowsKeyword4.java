package ExceptionHandling;

import java.util.Scanner;

public class ThrowsKeyword4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number: ");
        try{
            Details(scan.nextInt());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        scan.close();
    }
    static void Details(int a)throws ArithmeticException, ArrayIndexOutOfBoundsException {
        if(a>0){
            throw new ArithmeticException("Arithmetic Exception Occurs.");
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Array Out Of Bounce.");
        }
    }
}
