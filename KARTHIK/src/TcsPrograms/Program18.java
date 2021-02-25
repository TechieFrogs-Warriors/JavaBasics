package TcsPrograms;

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = vallidation(scan);
        int even=0,odd=0;
        if(number%2==0){//even series
            for(int i=1;i<=(number-2);i=i+2){
                even = even + 2;
                odd = even/2;
            }
            System.out.print(odd);
        }
        else{
            for(int i=1;i<=(number-2);i=i+2){
                even = even +2;
                odd =even/2;
            }
            even = even +2;
            System.out.print(even);
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
