import java.util.Scanner;

public class SampleProgram2 {
    public static void main(String[] args) {
        //Java Program to Compute Quotient(/) and Remainder(%)
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
        while((a<=-2147483648&a>=2147483647)&&(b<=-2147483648&b>=2147483647));
        System.out.println("The Quotient Value is:"+a+"/"+b+"="+(a/b));
        System.out.println("The Remainder value is:"+a+"%"+b+"="+(a%b));
        scan1.close();
        scan2.close();
    }
    
}
