package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class Pallindrom9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //taking input
        System.out.println("Enter Positive Ineger: ");
        int number = vallidation(scan);
       
        add_ToPallindrom(number);
    }
    //add sum until it become pallindrom
    public static void add_ToPallindrom(int number){
        if(cheak_Pallindrom(number)){
            System.out.println("Number is Already pllindrom");
        }
        else{
            while(!cheak_Pallindrom(number)){
                int reverse = reverse(number);
                int sum = number+reverse;
                number =sum;
                System.out.println("after addition pallindrom "+sum);
            }
        }
    }
    //cheak pallindrom
    public static boolean cheak_Pallindrom(int number){
        int reverse = reverse(number);
        if(reverse == number){
            return true;
        }
        else{
            return false;
        }
    }
    //reverse the number
    public static int reverse(int number){
        int rem = 0,reverse=0;
        while(number!=0){
            rem = number%10;//featch last digit
            reverse = (reverse*10)+rem; //store digit by digit  with mul of *10
            number = number/10;//remove last digit
        }
        return reverse;
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
