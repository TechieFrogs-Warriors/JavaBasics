package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class BinaryorNot10 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        //taking input
        int number = vallidation(scan);
        int rem=0;
        boolean flag = false;
        //logic to cheak binary or not
        while(number!=0){
            rem = number % 10;//give last digit
            if(rem!=0 && rem!=1){//cheaks digit is eigther 0 or 1
                flag = true;
            }
            number = number/10;//remove last digit
        }
        if(flag){
            System.out.println("Given Number is Not a Binary.");
        }
        else{
            System.out.println("Given Number is Binary .");
        }
    }
    //int vallidation
    public static int vallidation(Scanner scan){
        int number;
        do{
            while(!scan.hasNextInt()){
                System.out.println("Enter Positive integer only:");
                scan.next();
            }
            number = scan.nextInt();
        }while(number<0);
        return number;
    }
}
