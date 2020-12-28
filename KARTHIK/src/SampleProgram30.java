import java.util.Scanner;

public class SampleProgram30 {
    public static void main(String[] args) {
        //Left Pascal's Triangle
        Scanner scan=new Scanner(System.in);
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
        
        int a,b;
        for(a=0;a<=Number;a++){
            for(b=2*(Number-a);b>=0; b--){
            System.out.print(" ");
        }
            for(b=0;b<=a;b++){
                System.out.print("* ");
            }
        System.out.println();
        }
        for(a=Number-1;a>=0;a--){
            for(b=2*(Number-a);b>=0; b--){
            System.out.print(" ");
        }
            for(b=a;b>=0;b--){
                System.out.print("* ");
            }
        System.out.println();
        }

        scan.close();
       
    }
    
}
