import java.util.Scanner;

public class PatternProgram8 {
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
        int m,k;
        String S1="HELLO",S2="WORLD";
        k=S1.length();
        m=S2.length();

        for(int i=1;i<=Number;i++)
        {
            System.out.print(S1.substring(0,i));
        
            
        if(m>=1)
        {
                 System.out.print(S2.substring(0,m));
                 m--;
                }
                System.out.println();
        }
        scan.close();
    }
    
}
