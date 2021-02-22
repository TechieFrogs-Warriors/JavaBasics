package Accenturepgms;
import java.util.Scanner;

public class Ass18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            
            System.out.println("enter numbers only ");
            while(!sc.hasNextInt())
            {
                System.out.println("enter numbers");
                sc.next();
            }
            n=sc.nextInt();
        }while(n<=0);
        System.out.println("numbers are : " +n);
       
       
        long factorial=1;
        for(int i=1;i<n;++i){
            factorial*=i;///factorial=factorial*i
        }
        System.out.println("factorial of " + n + " ="  + factorial);
    }
    
}
