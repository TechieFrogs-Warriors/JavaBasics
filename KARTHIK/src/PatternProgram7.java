import java.util.Scanner;

public class PatternProgram7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Number;
        do{
            System.out.println("Enter Number: ");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter An Integer Value:");
                scan.next();
            }
            Number=scan.nextInt();
        }
        while(Number<=0);
        int a,b,c=97;
        for(a=1;a<=Number;a++){
            for(b=1;b<=a;b++){
                System.out.print(a);
            }
            for(b=Number;b>=a;b--){
                System.out.print((char)(c));
            }
            c++;
            System.out.println();
        }
    }
    
}
