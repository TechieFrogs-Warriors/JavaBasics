import java.util.Scanner;

public class AlphabetPatternProgram27 {
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
        int a,b,c,e,d=65;
        for(a=0;a<=Number;a++){
            for(b=0;b<=Number-a;b++){
                System.out.print((char)(d+b));
            }
            for(c=1;c<=a*2-1;c++){
                System.out.print(" ");
            }
            for(e=Number-a;e>=0;e--){
                if(e!=Number){
                    System.out.print((char)(d+e));
                }         
            }
            System.out.println();
        }
        scan.close();
    }
    
}
