import java.util.Scanner;

public class AlphabetPatternProgram26 {
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
        int a,b;
        for(a=0;a<=Number;a++){
            int c=65;
            for(b=0;b<=Number;b++){
                System.out.print((char)(c+a+b));
            }
             System.out.println();
             scan.close();  
        }           
    }
    
}
