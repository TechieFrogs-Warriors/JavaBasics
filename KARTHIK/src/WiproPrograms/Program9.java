package WiproPrograms;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number = vallidation(scan);
        //create an array
        int arr[]=new int[number];
        int arr1[]=new int[number];//store non prime numbers
        //variables
        boolean is_Prime=false;
        int prime_Count =0;
        int j=0;

        //assign the values to array
        for(int i=0;i<number;i++){
            System.out.println("Enter value:");
            arr[i]=scan.nextInt();
        }
        //print input array
        System.out.println("Input array: ");
        for(int a: arr){
            System.out.print(a+" ");
        }
        System.out.println("\noutput: ");
        //prime number logic
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=1)
            {
                arr1[j]=arr[i];
                j++;
            }
            else
            {
                is_Prime=prime(arr[i]);
                if(is_Prime)
                {
                    System.out.print(arr[i]+" ");
                    prime_Count++;
                }
                else
                {
                    arr1[j]=arr[i];
                    j++;
                    
                }
            }
            
        }
        for(int i=0;i<(arr1.length-prime_Count);i++)
        {
            System.out.print(" "+arr1[i]);
        }
    }
    //vallidation part
    public static int vallidation(Scanner scan){
        int number;
        do{
            System.out.println("Enter Number: ");
            while(!scan.hasNextInt()){
                System.out.println("Enter integer value Only: ");
                scan.next();
            }
        number=scan.nextInt();
        }
        while(number<=0);
        return number;
    }
    //prime number method
    public static boolean prime(int number) 
    {  
        
        for(int i=2;i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                return false;
            
            }  
        }
        return true;     
    }  
}
