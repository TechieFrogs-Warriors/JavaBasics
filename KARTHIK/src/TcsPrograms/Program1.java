package TcsPrograms;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number Of candies in jar:");
        int n_Candies = vallidation(scan);
        System.out.println("Enter number of candies required:");
        int r_Candies = vallidation(scan);
        int sold = 0;
        if(n_Candies>0 | n_Candies<=n_Candies/2 && n_Candies>r_Candies){
            sold = n_Candies -r_Candies;
            System.out.println("NUMBER OF CANDIES SOLD :"+r_Candies);
            System.out.println("NUMBER OF CANDIES AVAILABLE : "+sold);
        }
        else{
            System.out.println("INVALID INPUT.");
            System.out.println("NUMBER OF CANDIES AVAILABLE: "+n_Candies);
        }
    }
    //number vallidation
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
