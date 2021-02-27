package TcsPrograms;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Exterior walls: ");
        int e_wall = vallidation(scan);
        System.out.println("Enter Number of Exterior walls: ");
        int i_wall = vallidation(scan);
        //paint cost
        int i_Paint=18,e_Paint=12;
        float temp=0,cost=0;

        //logic
        if(e_wall<0 || i_wall<0){
            System.out.println("INVALID.");
        }
        else{
            if(e_wall==0 && i_wall==0){
                System.out.println("Total estimated Cost : 0.0");
            }
            else{
                System.out.println("Enter surfaces to intrior wall");
                for(int i = 0; i < i_wall; i++) {
                    temp = scan.nextFloat();
                    cost = cost+(i_Paint * temp);
                }
                System.out.println("Enter surfaces to exterior wall");
                for(int i = 0; i < e_wall; i++) {
                    temp = scan.nextFloat();
                    cost = cost+(e_Paint * temp);
                }
                System.out.printf("Total estimated Cost :"+ cost+" INR");
            }
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
