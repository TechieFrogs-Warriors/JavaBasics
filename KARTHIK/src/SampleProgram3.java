import java.util.Scanner;

public class SampleProgram3 {
    public static void main(String[] args) {
        //	Java Program to Swap Two Numbers
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        int a,b;
        do{
            System.out.println("Enter Two Integers:");
            while(!scan1.hasNextInt()||!scan2.hasNextInt()){
                System.out.println("Please Enter Integer Value:");
                scan1.next();
                scan2.next();

            }
            a=scan1.nextInt();
            b=scan2.nextInt();
        }
        while((a<=-2147483648&a>=2147483647)&&(b<=-2147483648&b>=2147483647));
         int c=a;
         System.out.println("Before Swap");
         System.out.println("Initial Value Of a="+a);
         System.out.println("Initial Value Of b="+b);
         a=b;//b value is copied into a
         b=c;//a value is copied into b
         System.out.println("After Swap");
         System.out.println("final value of a="+a);
         System.out.println("final value of b="+b);
         scan1.close();
         scan2.close();


    }
    
}
