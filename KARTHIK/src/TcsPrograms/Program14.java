package TcsPrograms;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number =vallidation(scan);
        if(number<30){
            if(number%2==0){//for even position
                int series;
                series=(int)Math.pow(3,(number/2)-1);
                System.out.print(series);
            }
            else{//for odd position
                int series;
                series=(int)Math.pow(2,((number/2)+1)-1);
                System.out.print(series);
            }
        }
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
