package ExceptionHandling;

import java.util.Scanner;

public class TryAndMultipleCatchBlocks21 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try{
            System.out.println("Enter Number:");
            int a=scan.nextInt();
            System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Number Formate Exception.");
        }
        scan.close();
    }
}
