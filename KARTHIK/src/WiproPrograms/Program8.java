package WiproPrograms;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = vallidation(scan);
        int rev1=0,rev2=0;
        //logic
        while(number!=0){
            int n1=number%10;//last digit
            rev1=(rev1*10)+n1;
            //if even
            if(rev1%2==0){
                rev1=rev1+1;
            }
            //if odd
            else{
                rev1=rev1-1;
            }
            number=number/10;
        }
        //reverse the number
        while(rev1!=0)
        {
            int n2=rev1%10;
            rev2=(rev2*10)+n2;
            rev1=rev1/10;
        
        }
        System.out.println(rev2);
    }
    //vallidation part
    public static int vallidation(Scanner scan){
        int number;
        do{
            System.out.println("Enter Number: ");
            while(!scan.hasNextInt()){
                System.out.println("Enter integer value Only: ");
                scan.next();
            }
        number=scan.nextInt();
        }
        while(number<=0);
        return number;
    }
}
