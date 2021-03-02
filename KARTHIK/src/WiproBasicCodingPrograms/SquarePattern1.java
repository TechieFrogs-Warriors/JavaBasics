package WiproBasicCodingPrograms;

import java.util.Scanner;

public class SquarePattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= vallidation(scan);
        for(int i=1;i<=n;i++){//loop for iterate number of rows
            for (int j=1;j<=n;j++){//loop for iterate number of columns
                if(i==1||i==n||j==1||j==n){//this condition print * at last lines only
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");//it prints spaces in between  values of i and j
                }
            }
            System.out.println();
        }
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
