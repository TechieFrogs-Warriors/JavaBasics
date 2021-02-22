package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class Factors11 {
    public static int factor(int number){
        int fact1=0,fact2=0;
        //for sum up the factors of the given number
        for(int i=1;i<number;i++){
            if(number%i==0){
                fact1=fact1+i;
                System.out.println(i);
            }
        }
        System.out.println(fact1);
        //sum up factors of given number sumfactor
        for(int i=1;i<fact1;i++){
            if(fact1%i==0){
                fact2=fact2+i;
            }
        }
        System.out.println(fact2);
        //compare the both sum factors
        if(fact1==fact2){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number;
        //validation part
        do{
            System.out.println("Enter Integer Value: ");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value only: ");
                scan.next();
            }
            number=scan.nextInt();
        }
        while(number<=0);

        System.out.println("given Number is: "+number);
        //calling factor method
        System.out.println(factor(number));
        scan.close();
    }
}
