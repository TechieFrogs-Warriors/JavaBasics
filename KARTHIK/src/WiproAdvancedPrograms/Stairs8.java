package WiproAdvancedPrograms;

import java.util.Scanner;

public class Stairs8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //number of stsirs is an input
        System.out.println("Enter Number of Stairs: ");
        int N = vallidation(scan);

        //number of ways 
        System.out.println("Output: "+countWays(N)+" ways.");
    }
    //method to find number of ways to reach the stair
    public static int countWays(int N){
        return fib(N+1);
    }
    //febonacci recursive method
    public static int fib(int n)
    {
        if (n <= 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    //int vallidation
    public static int vallidation(Scanner scan){
        int number;
        do{
            while(!scan.hasNextInt()){
                System.out.println("Enter Positive integer only: ");
                scan.next();
            }
            number = scan.nextInt();
        }while(number<0);
        return number;
    }
}
