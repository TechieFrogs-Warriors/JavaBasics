import java.util.Scanner;

public class PatternProgram12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Number;
        do{
            System.out.println("Enter Integer Value:");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Values:");
                scan.next();

            }
            Number=scan.nextInt();
        }
        while(Number<=0);
        int b,c,d,e;
        for(b=1;b<=Number;b++){
            for(c=Number;c>=b;c--){
                System.out.print(" ");
            }
            for(d=1;d<=b;d++){
                System.out.print(d);
            }
            for(e=b-1;e>=1;e--){
                System.out.print(e);
            }
            System.out.println();
            scan.close();
        }
    }
    
}
