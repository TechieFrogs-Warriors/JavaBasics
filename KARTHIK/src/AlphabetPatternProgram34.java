import java.util.Scanner;

public class AlphabetPatternProgram34 {
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
        int alphabet=65;
        for(int i=0;i<Number;i++){
            for(int j=0;j<=i;j++){
                if(j%2==0)
                System.out.print((char)(alphabet+j*Number-(j-1)*j/2+i-j)+" ");
                else 
                System.out.print((char)(alphabet+j*Number-(j-1)*j/2+Number-1-i)+" ");
            }
            System.out.println();
        }
        scan.close();
    }
    
}
