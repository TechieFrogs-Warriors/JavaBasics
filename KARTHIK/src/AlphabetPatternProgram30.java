import java.util.Scanner;

public class AlphabetPatternProgram30 {
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
        int a,b,c=65,e=1;
        for(a=1;a<=Number/2+1;a++){
            for(b=1;b<=a;b++){
                System.out.print((char)(c+(e*b)-1)+" ");
            }
            System.out.println();
            e++;
        }
        for(a=1;a<=Number/2;a++){
            for(b=1;b<=Number/2+1-a;b++){
                System.out.print((char)(c+(e*b)-1)+" ");
            }
            System.out.println();
            e++;
        }
        scan.close();
    }
    
}
