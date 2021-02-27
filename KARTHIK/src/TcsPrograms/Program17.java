package TcsPrograms;

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int a = vallidation(scan);
        System.out.println("Enter Number2: ");
        float b = vallidation1(scan);
        add(a, b);//addition method
    }
    //addito method
    public static void add(int a,float b){
        float result =a+b;
        System.out.println("Sum: "+result);
    }
    //int vallidation
    public static int vallidation(Scanner scan){
        int number;
        do{
            System.out.println("Enter positive integer: ");
            while(!scan.hasNextInt()){
                System.out.println("Enter Integer  value only: ");
                scan.next();
            }
            number = scan.nextInt();
        }
        while(number<0);
        return number;
    }
    //float vallidation
    public static float vallidation1(Scanner scan){
        float number;
        do{
            System.out.println("Enter positive integer: ");
            while(!scan.hasNextFloat()){
                System.out.println("Enter Integer  value only: ");
                scan.next();
            }
            number = scan.nextFloat();
        }
        while(number<0);
        return number;
    }
}
