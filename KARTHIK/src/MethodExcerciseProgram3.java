import java.util.Scanner;

public class MethodExcerciseProgram3 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        int n1,n2;
        do{
            System.out.println("Enter Two Integers:");
            while(!scan1.hasNextInt() && !scan2.hasNextInt()){
                System.out.println("Please Enter Integer Value:");
                scan1.next();
                scan2.next();

            }
            n1=scan1.nextInt();
            n2=scan2.nextInt();
        }
        while(n1<=0 && n2<=-0);
        method1(n1,n2);
        method1( n2 );
        scan1.close();
        scan2.close();
    }
    public static int method1(int a,int b){
        if(a!=b){
            System.out.println("Area Of The Rectangle Is:");
            int c=a*b;
            System.out.print(c);
        }
        else 
        System.out.println("The Breath And Length Are Same,Its Not Form A Rectangle");
        return 0;

    }
    public static int method1(int a){
        int b=a*a;
        System.out.println("Area Of The Square Is: "+b);
        return 0;
    }
    
}
