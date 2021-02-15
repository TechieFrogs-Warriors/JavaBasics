import java.util.Scanner;

public class Assesment {
    public static void main(String[] args) {
        int Number;
        Scanner scan=new Scanner(System.in);
        //validation
        do{
            System.out.println("Enter Positive Number: ");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Positive Integer: ");
                scan.next();
            }
            Number=scan.nextInt();
        }while(Number<=0);
        //coding
        System.out.println("Number of rows: "+Number);
        int i,j;
        for( i=1;i<=Number;i++){//Number of rows
            for( j=1;j<=Number;j++){//first part
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                } 
            }
            j--;
            System.out.print("*");//second part
            while(j>=1){//third part
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
                j--;
            }
            System.out.println();  
        }
    }
}
