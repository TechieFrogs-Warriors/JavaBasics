import java.util.Scanner;

public class Sampleprogram32 {
    public static void main(String[] args) {
        //Armstrong Number in Java
        Scanner scan=new Scanner(System.in);
        int Number;
        do{
            System.out.println("Enter Integer Value: ");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter An Integer: ");
                scan.next();
            }
            Number=scan.nextInt();
        }
        while(Number<=0);
        int Sum=0,Reverse,Temp=0;
        Temp=Number;
        while(Number!=0){
            Reverse=Number%10;
            Sum=Sum+(Reverse*Reverse*Reverse);
            Number=Number/10;
        }
        if(Temp==Sum){
            System.out.println(Temp+" Is a Armstrong Number");
        }
        else 
        System.out.println(Temp+" Is Not a Armstrong Number");
        scan.close();

  
    }
    
}
