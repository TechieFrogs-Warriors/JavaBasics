import java.util.Scanner;

public class PatternProgram2 {
    public static void main(String[] args) {
        /*Java program to print the following pattern
        *000*000*
        0*00*00*0
        00*0*0*00
        000***000
        */
        Scanner scan=new Scanner(System.in);
        int Number;//validation part
        do{
            System.out.println("Enter Integer Value:");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value:");
                scan.next();

            }
            Number=scan.nextInt();
        }
        while(Number<=0);
        System.out.println("Output Pattern");
        int a,b;
        for(a=1;a<=Number;a++){
            for(b=1;b<=Number;b++){
                if(a==b)
                System.out.print("*");
                else 
                System.out.print("0");
            }
            b--;
            System.out.print("*");
           while(b>=1){
                if(a==b)
                System.out.print("*");
                else 
                System.out.print("0");
                b--;
            }
            System.out.println();
            scan.close();
        }

    }
    
}
