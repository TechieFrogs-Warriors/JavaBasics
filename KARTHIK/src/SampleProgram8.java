import java.util.Scanner;

public class SampleProgram8 {
    public static void main(String[] args) {
        //	Java Program to Find Factorial of a Number 
        Scanner scan=new Scanner(System.in);
        int a;//validation part
        do{
            System.out.println("Enter Integer Value:");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value:");
                scan.next();

            }
            a=scan.nextInt();
        }
        while(a<=0);
        int b=1;
        int c=1;
        while(c<=a){
            b*=c;
            c++;
            scan.close();
        }
        System.out.println("The Factorial Of Given Number Is:"+b);
         



    }
    
}
