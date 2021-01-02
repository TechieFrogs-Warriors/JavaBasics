import java.util.Scanner;

public class AlphabetPatternProgram17 {
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
        for(b=0;b<=Number;b++){
            for(c=0;c<=b;c++){
                System.out.print(" ");
            }
            for(d=b;d<=Number;d++){
                System.out.print((char)(a+d)+" ");
            }
            System.out.println();
        }
        for(b=Number;b>=0;b--){
            for(c=0;c<=b;c++){
                System.out.print(" ");
            }
            for(d=b;d<=Number;d++){
                System.out.print((char)(a+d)+" ");
            }
            System.out.println();
            scan.close();
        }

        
    }
    
}
