package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class DigiRoot14 {
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
        int sum = 0;
        while(number >= 10) {
            sum=0;
            while(number!=0){
                sum = sum + number % 10;//last Number is added to sum
                number = number/ 10;
            }
            if(sum>=10){
                number=sum;
            }
        }
        System.out.println(sum);
        scan.close();
    } 
}
