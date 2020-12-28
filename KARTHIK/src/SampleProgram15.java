import java.util.Scanner;

public class SampleProgram15 {
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
        int c=a,d=b,e;
        while(a!=b){
            if(a>b)
            a=a-b;
            else
            b=b-a;
        }
        e=(c*d)/b;

        System.out.println("The LCM Of Given Value "+c+","+d+" "+"Is:"+e);
       
        
    }
    
}
