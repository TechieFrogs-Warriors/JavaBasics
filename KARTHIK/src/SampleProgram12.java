import java.util.Scanner;

public class SampleProgram12 {
    public static void main(String[] args) {
        //Java Program to Find GCD of two Numbers
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        int a,b;
        do{
            System.out.println("Enter Two Integers:");
            while(!scan1.hasNextInt()&&!scan2.hasNextInt()){
                System.out.println("Please Enter Integer Values:");
                scan1.next();
                scan2.next();

            }
            a=scan1.nextInt();
            b=scan2.nextInt();
            scan1.close();
            scan2.close();
        }
        while((a<=0)&&(b<=0));
        
        int c;
        int d=0;
        for(c=1;c<=a&&c<=b;c++){
            if(a%c==0&&b%c==0)
            d=c;
            
            
        }
        
        System.out.println("The GCD Of Given Value "+a+","+b+" "+"Is:"+d);
        

        
    }
    
}
