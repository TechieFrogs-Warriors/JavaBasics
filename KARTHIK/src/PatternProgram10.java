import java.util.Scanner;

public class PatternProgram10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Number;
        do{
            System.out.println("Enter Number: ");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value: ");
                scan.next();
            }
            Number=scan.nextInt();
        }
        while(Number<=0);
        int a,b;
         System.out.println(0);

         for(a=Number;a>=1;a--){
             for(b=a;b<=Number;b++){
                 System.out.print(b);
            }
                System.out.print(0);
                for(b=Number;b>=a;b--){
                    System.out.print(b);
                }
         System.out.println();
        }
        scan.close();
    }
}
