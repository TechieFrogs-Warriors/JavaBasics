import java.util.Scanner;

public class Alphabetpatternprogram14 {
    public static void main(String[] args) {
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
        int a=65;
        int b,c,d;
        for(b=Number;b>=0;b--){
            for(c=b;c>=0;c--){
                System.out.print(" ");
            }
            for(d=0;d<=Number-b;d++){
                System.out.print((char)(a+d)+" ");
            }
            System.out.println();
        }
        for(b=-1;b<=Number;b++){
            for(c=0;c<=b;c++){
                System.out.print(" ");
            }
            for(d=0;d<=Number-b;d++){
                System.out.print((char)(a+d)+" ");
            }
            System.out.println();
            scan.close();
        }
    }
    
}
