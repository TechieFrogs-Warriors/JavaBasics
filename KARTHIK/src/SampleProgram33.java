import java.util.Scanner;

public class SampleProgram33 {
    public static void main(String[] args) {
        //Prime Number Program in Java
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
        int Temp;
        boolean Prime=true;
        for(int b=1;b<=Number/2;b++){
            Temp=Number%b;
            if(Temp==0){
                Prime=false;
                break;
            }
        }
        if(Prime)
        System.out.println(Number+" Is a Prime Number");
        else
        System.out.println(Number+"Is Not a Prime Number");
        scan.close();
    }
    
}
