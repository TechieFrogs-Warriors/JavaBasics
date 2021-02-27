package InfosisPrograms;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = vallidation(scan);//number of math books
        int m = vallidation(scan);//number of chemistry books
        int k = vallidation(scan);//number of science books
        int x = vallidation(scan);//number of alisa books

        n = fact(n,1);
        m = fact(m,2);
        k = fact(k,x);
        System.out.println(n*m*k);


    }
    //factorial method
    public static int fact(int number, int d){
        int fact =1,fact1=1;
        int number1 =number - d;
        for(int i=number;i>=1;i--){
            fact = fact*i;
        }
        for(int j=number1;j>=1;j--){
            fact1 = fact1*j;
        }
        
        int p=(number1+fact)/(d*fact1);
        return p;
    }
    //vallidation
    public static int vallidation(Scanner scan){
        int number;
        do{
            System.out.println("Enter positive integer: ");
            while(!scan.hasNextInt()){
                System.out.println("Enter Integer  value only: ");
                scan.next();
            }
            number = scan.nextInt();
        }
        while(number<0);
        return number;
    }
}
