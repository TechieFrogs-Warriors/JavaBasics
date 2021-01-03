import java.util.Scanner;

public class AlphabetPatternProgram29 {
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
        int a,b,c,d=65,e=0;
        for(a=Number;a>=1;a--){
            for(b=Number;b>=a;b--){
                System.out.print((char)(d+b-1)+" ");
                e=b;
            }
            for(c=Number-a+1;c<=Number;c++){
                System.out.print((char)(d+e-1)+" ");
            }
            System.out.println();
        }
        scan.close();
    }   
}
