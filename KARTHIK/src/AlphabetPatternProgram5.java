import java.util.Scanner;

public class AlphabetPatternProgram5 {
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
        int a,b;
        int c=65;
        for(a=Number;a>0;a--){
            for(b=a;b>=0;b--){
                System.out.print((char)(c+b));
            }
            System.out.println();
        }
        for(a=0;a<Number+1;a++){
            for(b=a;b>=0;b--){
                System.out.print((char)(c+b));
            }
            System.out.println();
        }
       
    }
    
}
