import java.util.Scanner;

public class PatternProgram1 {
    public static void main(String[] args) {
        /*Java program to print the following pattern
        5432*
        543*1
        54*21
        5*321
        *4321
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
        int a,b;
        for(a=1;a<=Number;a++){
            for(b=Number;b>=1;b--){
                if(b!=a)
                System.out.print(b);
                else 
                System.out.print("*");

            }
            System.out.println("  ");
            scan.close();
        }
        
    }
    
}
