import java.util.Scanner;

public class AlphabetPatternProgram25 {
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
        int a,b,c=65,temp=1;
        for(a=0;a<=Number;a++){
            temp=a;
            for(b=0;b<=a;b++){
                System.out.print((char)(c+temp)+" ");
                temp=temp+Number-b;
                
            }
            System.out.println();
            scan.close();
        }

    }
    
}
