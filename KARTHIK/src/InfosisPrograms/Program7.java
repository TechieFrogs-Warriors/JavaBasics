package InfosisPrograms;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = vallidation(scan);//length of ATM array
        int ATM[] = new int[N];
        //assign values to array
        for(int i=0;i<N;i++){
            ATM[i]=scan.nextInt();
        }
        int X = vallidation(scan);//Amount to withdrawn

        System.out.println(withdrawn(ATM, N, X));
    }
    //withdrawn method
    public static int withdrawn(int ATM[],int N,int X){
        int amount = 0,remain=0;
        for(int i=0;i<N;i++){
            amount = amount +ATM[i];
        }
        if(X>amount){
            return -1;
        }
        else{
            remain = amount -X;
        }
        return remain;
    }
    //int vallidation
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
