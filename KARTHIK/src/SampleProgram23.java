import java.util.Scanner;

public class SampleProgram23 {
    public static void main(String[] args) {
        //	Program to print full pyramid using *
        Scanner scan= new Scanner(System.in);
        int Number;
        do{
            System.out.println("Enter Integer Value:");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value:");
                scan.next();

            }
            Number=scan.nextInt();
        }
        while(Number<=0);
        int a,b,d;
        for(a=1;a<=Number;a++){
            for(b=1;b<=(Number-a);b++){
                System.out.print("  ");

            }
            for(d=1;d<=(2*a-1);d++){
                System.out.print("* ");

            }
            System.out.println();
        }
        
    }
    
}
