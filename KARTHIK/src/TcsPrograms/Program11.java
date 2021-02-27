package TcsPrograms;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = vallidation(scan);
        leap_Year(year);
    }
    //leap year
    public static void leap_Year(int year){
        boolean flag = false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    flag=true;
                }
                else{
                    flag = false;
                }
            }
            else{
                flag=true;
            }
        }
        else{
            flag=false;
        }
        if(flag)
        System.out.println(year+" :is leap year");
        else
        System.out.println(year+" :is not a leap year");
    }
    //int valliadation
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
