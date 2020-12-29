import java.util.Scanner;

public class SampleProgram18 {
    public static void main(String[] args) {
        //Program to print half pyramid a using numbers
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
        System.out.println("Output");
        for(a=1;a<=Number;a++){
            for(b=1;b<=a;b++){
                System.out.print(b);
            }
            System.out.println();
        }
        scan.close();
    }
    
}
