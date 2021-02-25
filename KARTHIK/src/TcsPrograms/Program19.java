package TcsPrograms;

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter position:");
        int number = vallidation(scan);//which term you want from series

        //Logic to find n position value
        int n_position=0;
        while(number>0)
        {
            n_position++;
            if(n_position==1)
            {
                number--;
            }//it prints only factors of 2,3,5
            if(n_position % 2 == 0 ||n_position % 3 == 0||n_position% 5 == 0 )
            {
                number--;
                
            }
        }
        System.out.println("nth term of the series is: "+n_position);
        
    
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
