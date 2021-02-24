package WiproPrograms;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number=vallidation(scan);
        int reverse=0;
        int temp=number;

        //reverse the number
        while(number!=0){
            int rem=number%10;
            reverse=reverse*10+rem;
            number= number/10;
        }
        //diffrenece b/w two numbwrs is
        System.out.println("Difference: "+(reverse-temp));

    }
    //vallidation part
    public static int vallidation(Scanner scan){
        int number;
        do{
            System.out.println("Enter Number: ");
            while(!scan.hasNextInt()){
                System.out.println("Enter integer value Only: ");
                scan.next();
            }
        number=scan.nextInt();
        }
        while(number<=0);
        return number;
    }
}
