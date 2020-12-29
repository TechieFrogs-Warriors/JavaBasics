import java.util.Scanner;

public class SampleProgram19 {
    public static void main(String[] args) {
        //Inverted half pyramid using *
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
        for(a=Number;a>=1;a--){
            for(b=1;b<=a;b++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    
}
