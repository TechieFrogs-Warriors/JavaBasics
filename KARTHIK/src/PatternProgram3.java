import java.util.Scanner;

public class PatternProgram3 {
    public static void main(String[] args) {
        /*Java program to print the following pattern
        1
        2 4
        3 6 9
        4 8 12 16
        5 10 15 20 25
        6 12 18 24 30 36
        7 14 21 28 35 42 49
        8 16 24 32 40 48 56 64
        9 18 27 36 45 54 63 72 81
        10 20 30 40 50 60 70 80 90 100
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
            for(b=1;b<=a;b++){
                System.out.print(a*b+" ");
            }
            System.out.println(" ");
            scan.close();
        }


        
    }
    
}
