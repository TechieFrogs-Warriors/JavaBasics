package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class FactorialOfNumber20 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Number;
        //validaton part
        do{
            System.out.println("Enter Integer Value: ");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value only: ");
                scan.next();
            }
            Number=scan.nextInt();
        }
        while(Number<=0);
        //factorial of number
        int fact=1;
        for(int i=1;i<=Number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial Of the Given Number:"+fact);
        scan.close();
    }
}
