package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class NonZeroDigitFactorial9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number;
        // vallidation part
        do{
            System.out.println("Enter Integer Value: ");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value only: ");
                scan.next();
            }
            number=scan.nextInt();
        }
        while(number<=0);

        //factorial of the given number
        int fact=1;
        for(int i=1;i<=number;i++){
            fact = fact * i;
        }
        System.out.println("Factorial :"+fact);
        //reminder
        int div = fact % 10;
        //System.out.println(div);
        if(div==0){
            int rem=fact/10;//remove zero 
            int value=rem%10;//gives last digit
        
            //remove another zero from last
            if(value==0){
                int rem1=rem/10;
                int value1=rem1%10;
                System.out.println("Non Zero Digit is: "+value1);
            }
            else
            System.out.println("Non zero Digit is: "+value);
        }
        else{
            System.out.println("Non zero Digit is: "+div);
        }

        scan.close();
    }
}
