package Accenturepgms;

import java.util.Scanner;

public class Ass16 {
    public static void main(String[] args) {
        int n,sum1=0,sum2=0;
        Scanner sc=new Scanner(System.in);
        //validation
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
       
        
        int[] a=new int[n];
       
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){//checking for even numbers
                 sum1=sum1 +a[i];//summing even values 
            }
            else{
                sum2=sum2+a[i];//summing remaining values
            }
        }
        System.out.println("sum of even :" + sum1);
        System.out.println("sum of odd :" + sum2);
    }
    
}
