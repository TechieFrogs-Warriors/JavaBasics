package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class ChangingPosition15 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);

        //validation part
        int a,b;
        do{
            System.out.println("Enter values of a and b: ");
            while(!scan1.hasNextInt() | !scan2.hasNextInt()){
                System.out.println("Enter Integers only: ");
                scan1.next();
                scan2.next();
            }
            a=scan1.nextInt();
            b=scan2.nextInt();
        }
        while(a<=0&&b<=0);
        //a value is assgn to x
        int x=a;
        //assigning b value to x
        x=a+b-x;
        System.out.println("After Value of x:"+x);

        x=b;
        //assigning a value to x
        x=a+b-x;
        System.out.println("After Value of x:"+x);
        scan1.close();
        scan2.close();
    }
}
