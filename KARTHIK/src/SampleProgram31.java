import java.util.Scanner;

public class SampleProgram31 {
    public static void main(String[] args) {
        //Palindrome number algorithm
        Scanner scan=new Scanner(System.in);
        int Number;
        do{
            System.out.println("Enter Integer Value:");
            while(!scan.hasNextInt()){
                System.out.println("please enter integer values:");
                scan.next();

            }
            Number=scan.nextInt();
        }
        while(Number<=0);
        int Temp,Reminder,Reverse=0;
        Temp = Number;
        while(Temp > 0) {
            Reminder = Temp %10;
            Temp = Temp /10;
            Reverse = Reverse * 10 + Reminder;
        }
        if(Temp==Reverse)
        System.out.println("Given Number Is Palindrom");
        else 
        System.out.println("Given Number Is Not a Palindrom");
        scan.close();
        
    }
    
}
