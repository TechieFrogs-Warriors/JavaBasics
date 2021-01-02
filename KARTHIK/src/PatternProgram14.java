import java.util.Scanner;

public class PatternProgram14 {
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
        int a,b;
        
        for(a=0;a<=Number;a++){
            String s="";
            int c=97;
            for(b=0;b<=a;b++){
                s=s+(char)c+" + ";
                c++;
            }
            System.out.println("("+s.substring(0,s.length()-3)+")");
            scan.close();
        }
    
    }

    
}