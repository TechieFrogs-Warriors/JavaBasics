import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Number;
        do{
            System.out.println("Enter Number: ");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value Only: ");
                scan.next();
            }
            Number=scan.nextInt();
        }
        while(Number<=0);
        for(int i=0;i<=Number;i++){
            for(int j=i;j>=0;j--){
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
