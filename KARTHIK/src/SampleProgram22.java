import java.util.Scanner;

public class SampleProgram22 {
    public static void main(String[] args) {
        // Program to print half pyramid using alphabets
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
        int a,b,c=65;
        for(a=1;a<=Number;a++){
            for(b=1;b<=a;b++){
                System.out.print((char)(c+a-1)+" ");
            }
            System.out.println();
        }
    }
    
}
