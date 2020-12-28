import java.util.Scanner;

public class SampleProgram29 {
    public static void main(String[] args) {
        //Sandglass Star Pattern
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
        int a,b,d;
        for(a=Number;a>=1;a--){
            for(b=Number-a;b>=1;b--){
                System.out.print("  ");
            }
            for(d=2*a-1;d>=1;d--){
                System.out.print("* ");
            }
            System.out.println();
        }
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
