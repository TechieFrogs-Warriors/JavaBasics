import java.util.Scanner;

public class PatternProgram6 {
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
        int a,b;
        for(a=1;a<=Number;a++){
            for(b=1;b<=Number;b++){
                if(a==1||a==Number||b==1||b==Number)
                System.out.print("1");
                else 
                System.out.print(" ");
            }
            System.out.println();
        }   
        scan.close(); 
    }
    
}
