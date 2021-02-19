import java.util.Scanner;

public class PatternProgram4 {
    public static void main(String[] args) {
        /*Java program to print the following pattern
        1     1
         2   2
          3 3 
           4
          3 3
         2   2
        1     1  
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
            for(b=1;b<=Number/2;b++){
                if(a==b)
                System.out.print(b);
                else if(a>Number/2&&b==Number-a)
                System.out.print(b);
                else
                System.out.print(" ");

            }
            b=b-2;
            while(b>0){
                if(a==b)
                System.out.print(b);
                else if(a>Number/2&&b==Number-a)
                System.out.print(b);
                else
                System.out.print(" ");
                b--;
                
            }
            System.out.println("");
            scan.close();
        }
    }
    
}
