package TcsPrograms;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = vallidation(scan);
        int flag =0;
        if(number>0){
            if(number==0||number==1){
                System.out.println("Not a Prime.");
            }
            else{
                for(int i=2;i<=number/2;i++){
                    if(number%i==0){
                        flag = 1;
                    }
                }
                if(flag==0){
                    System.out.println(number+" :is Prime");
                }
                else
                System.out.println(number+" :is Not a Prime");
            } 
        }
        else{
            System.out.println("Please Enter a Positive Number.");
        }
    }
    //int valliadation
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
