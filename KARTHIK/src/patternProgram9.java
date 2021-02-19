import java.util.Scanner;

public class patternProgram9 {
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
        String S="ISTS";
        for(int i=1;i<=Number;i++)
        {
            System.out.println(S.substring(0,i));
        }
        scan.close();
    }
    
}
