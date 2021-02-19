import java.util.Scanner;

public class PatternProgram5 {
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
        int i,j;
         for(i=1;i<=Number;i++)
         {
             for(j=1;j<=Number;j++)
             {
                 if(j==1||j==Number||i==j)
                 {
                     
                     System.out.print(i);
                 }
                 
                 else
                 {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
        scan.close();
    }
    
}
