import java.util.Scanner;

public class PatternProgram13 {
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
        int i,j;
        for( i=Number;i>=1;i--) {
            for(j=1;j<=Number;j++){
                if(j>i){
                    System.out.print("*");
                } 
                else{
                    System.out.print(j);
                }
            }
            for( j=Number;j>=1;j--){
                if(j>i){
                    System.out.print("*");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        } 
        scan.close();
    }
    
}
