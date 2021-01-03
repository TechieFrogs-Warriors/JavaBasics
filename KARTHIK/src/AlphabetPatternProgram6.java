import java.util.Scanner;

public class AlphabetPatternProgram6 {
    public static void main(String[] args) {
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
        int c=65;
        for(a=0;a<=Number;a++){
            for(b=Number;b>=a;b--){
                System.out.print(" ");

            }
            for(d=0;d<=a;d++){
                System.out.print((char)(c+d)+" ");

            }
            System.out.println();
            scan.close();
        }
    }
    
}
