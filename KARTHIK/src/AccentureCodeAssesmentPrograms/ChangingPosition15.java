package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class ChangingPosition15 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);

        //validation part
        String a,b;
        do{
            System.out.println("Enter values of a and b: ");
            while(!scan1.hasNext("[A-Za-z1-9]*") | !scan2.hasNext("[A-Za-z1-9]*")){
                System.out.println("Enter Strings only: ");
                scan1.next();
                scan2.next();
            }
            a=scan1.next();
            b=scan2.next();
        }
        while(a.equals("")&&b.equals(""));
        //a value is assgn to x
        String x=a;
        //assigning b value to x
        x=b.concat(a);
        x=x.substring(0,b.length());
        System.out.println("After Value of x:"+x);

        x=b;
        //assigning a value to x
        x=a.concat(b);
        x=x.substring(0, a.length());
        System.out.println("After Value of x:"+x);
        scan1.close();
        scan2.close();
    }
}
