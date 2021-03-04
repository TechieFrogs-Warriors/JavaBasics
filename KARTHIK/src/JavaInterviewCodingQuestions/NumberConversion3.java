package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class NumberConversion3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // taking Number as a input
        System.out.println("Enter Positive Number:");
        int decimal = vallidation(scan);

        //these are building methods to give decimal to hex,oct,binary conversion values
        // System.out.println(Integer.toHexString(decimal));
        // System.out.println(Integer.toBinaryString(decimal));
        // System.out.println(Integer.toOctalString(decimal));

        //converting decimal to binary
        System.out.println("Decimal to Binary: "+binary(decimal));
        System.out.println("Decimal to Octal: "+octal(decimal));
        System.out.println("Decimal to HexaDecimal: "+hexa_Decimal(decimal));
        
    }
    //decimal to Binary
    public static String binary(int decimal){
        String binary = " ";//store reminders of the number
        int rem=0;
        while(decimal!=0){
            rem =  decimal%2;//give reminder
            binary = rem + binary;//appending all remindrs
            decimal = decimal/2;//give quetiont
        }
        return binary;
    }
    //decimal to octal
    public static String octal(int decimal){
        String octal = " ";
        int rem=0;
        while(decimal!=0){
            rem =  decimal%8;
            octal = rem + octal;
            decimal = decimal/8;
        }
        return octal;
    }
    //decimal to hexadecimal
    public static String hexa_Decimal(int decimal){
        String hexa_Decimal = " ";
        int rem=0;
        while(decimal!=0){
            rem =  decimal%16;
            hexa_Decimal = rem + hexa_Decimal;
            decimal = decimal/16;
        }
        return hexa_Decimal;
    }

    //int vallidation
    public static int vallidation(Scanner scan){
        int number;
        do{
            while(!scan.hasNextInt()){
                System.out.println("Enter Positive integer only:");
                scan.next();
            }
            number = scan.nextInt();
        }while(number<0);
        return number;
    }
}
