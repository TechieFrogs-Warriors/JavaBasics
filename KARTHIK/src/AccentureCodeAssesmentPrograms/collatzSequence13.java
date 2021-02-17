package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class collatzSequence13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number;
        //vallidation part
       do{
           System.out.println("Enter Number:");
           while(!scan.hasNextInt()){
               System.out.println("Enter integer Number only:");
               scan.next();
            }
            number=scan.nextInt();
        }
        while(number<=0);
        //create an array

        //collatz sequence upto 1
        while(number>1){
            //for even
            if(number%2==0){
                number = number / 2;
                System.out.print(number+" ");
            }
            //for odd
            else{
                number=3*number+1;
                System.out.print(number+" ");
            }

        }
        scan.close();
    }
}
