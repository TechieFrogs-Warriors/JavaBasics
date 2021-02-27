package InfosisPrograms;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = vallidation(scan);
        int number = Integer.parseInt(str);//String to int convertion
        int K = vallidation1(scan);//removing digit size

        System.out.println(smallest(number, K));//method calling
        
    }
    public static int smallest(int number,int k){
        //delete the digits according to k
        for(int i=0;i<k;i++){
            number = number/10;
            System.out.println(number);
        }
        //to find small
        number = number %(int)(Math.pow(10, 9)+7);

        return number;
    }
    //String vallidation
    public static String vallidation(Scanner scan){
        String s;
        do{
            System.out.println("Enter string ");
            while(!scan.hasNext("[0-9]*")){
                System.out.println("Its not valid string.Enter again");
                scan.next();
            }
            s=scan.nextLine();
        }while(s.equals(""));
        return s;
    }
    //int vallidation
    public static int vallidation1(Scanner scan){
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
}
