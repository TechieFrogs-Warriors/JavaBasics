import java.util.Scanner;

public class SampleProgram9 {
    public static void main(String[] args) {
        //Java Program to Calculate the Sum of Natural Numbers using for loop
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
        int c=0;

        for(int b=0;b<=a;b++){
            c+=b;
           
        }
        System.out.println("Sum Of The Natural Numbers:"+c);
        scan.close();


        
    }
    
}
