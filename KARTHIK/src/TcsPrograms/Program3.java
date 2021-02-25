package TcsPrograms;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight of Cloths:");
        int weight = vallidation(scan);
        if(weight>0 && weight<=7000){
            if(weight>0 & weight<=2000){
                System.out.println("Time Estimated: 25 minutes");
            }
            else if(weight >= 2001 & weight <= 4000){
                System.out.println("Time Estimated: 35 minutes");
            }
            else if(weight >= 4001 & weight <= 7000) {
                System.out.println("Time Estimated: 45 minutes");
            }
        }
        else{
            System.out.println("INVALID INPUT.");
        }
    }
    //vallidation part
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
}
