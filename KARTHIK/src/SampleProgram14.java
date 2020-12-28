import java.util.Scanner;

public class SampleProgram14 {
    public static void main(String[] args) {
        //Java Program to Find LCM of two Numbers
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
        }
        while((a<=0)&&(b<=0));
        scan1.close();
        scan2.close();
        int c,d=0,e;
        for(c=1;c<=a&&c<=b;c++){
            if(a%c==0&&b%c==0)
            d=c;

        }
         e=(a*b)/d;
         System.out.println("lcm of the two numbers "+a+" , "+b+"is:"+e);
         
         

    
    }
    
}
