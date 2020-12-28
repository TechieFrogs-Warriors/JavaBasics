import java.util.Scanner;
public class Sampleprogram1 {
    public static void main(String[] args) {
        //	Java Program to Add Two Integers
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        int a,b;
        do{
            System.out.println("Enter Two Integers:");
            while(!scan1.hasNextInt()&&!scan2.hasNextInt()){
                System.out.println("Please Enter Integer Value:");
                scan1.next();
                scan2.next();

            }
            a=scan1.nextInt();
            b=scan2.nextInt();
        }
        while(a<=0&&b<=0);
       
        System.out.println("The Addition Value Is: "+(a+b));
        scan1.close();
        scan2.close();


    }
    
}
