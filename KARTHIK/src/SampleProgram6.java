import java.util.Scanner;

public class SampleProgram6 {
    public static void main(String[] args) {
        //	Java Program to Find the Largest Among Three Numbers
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        Scanner scan3=new Scanner(System.in);
        int a,b,c;
        do{
            System.out.println("Enter Three Integers:");
            while(!scan1.hasNextInt()|!scan2.hasNextInt()|!scan3.hasNextInt()){
                System.out.println("Please Enter Integer Values:");
                scan1.next();
                scan2.next();
                scan3.next();
            }
            a=scan1.nextInt();
            b=scan2.nextInt();
            c=scan3.nextInt();
        }
        while(a<=0&b<=0);

        if(a>b&&a>c)
            System.out.println("a Is Larger Than b And c"+a);
            else if(b>a&&b>c)
            System.out.println("b Is Larger Than a And c"+b);
        else 
        System.out.println("c Is Larger Than b And a"+c);
        scan1.close();
        scan2.close();
        scan3.close();


        }

        
    }
    

