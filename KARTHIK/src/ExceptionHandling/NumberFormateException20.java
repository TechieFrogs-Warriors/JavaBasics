package ExceptionHandling;

import java.util.Scanner;

public class NumberFormateException20 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=scan.nextLine();
        NumberFormate(s);
        scan.close();

    }
    static void NumberFormate(String s){
        try{
            int Number=Integer.parseInt(s);
            System.out.println(Number);
        }
        catch(NumberFormatException e){
            e.printStackTrace();
            System.out.println("Number Foramte Exception");
        }
    }
}
