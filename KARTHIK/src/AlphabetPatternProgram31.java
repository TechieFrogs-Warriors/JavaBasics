import java.util.Scanner;

public class AlphabetPatternProgram31 {
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
        int a,b,c=65;
        int d=(Number*(Number-1))/2;
        for(a=1;a<=Number-1;a++){
            d=d-a;
            for(b=1;b<=a;b++){
                System.out.print((char)(c+d+b-1)+" ");
            }
            System.out.println();
        }
        
        scan.close();
    }
    
}
