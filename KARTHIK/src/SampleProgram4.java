import java.util.Scanner;

public class SampleProgram4 {
    public static void main(String[] args) {
        //	Java Program to Check Whether a Number is Even or Odd
        Scanner scan=new Scanner(System.in);
        int a;
        do{
            System.out.println("Enter Integer Value:");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value:");
                scan.next();

            }
            a=scan.nextInt();
        }
        while(a<=0);
        if(a%2==0){
            System.out.println("Even Number:"+a);
        }
        else 
        System.out.println("Odd Number:"+a);
        scan.close();
    }
    
}
