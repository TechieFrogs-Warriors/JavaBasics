package InfosisPrograms;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = vallidation(scan);
        int A[] = new int[N];
        //enter elements to ana array
        for(int i=0;i<N;i++){
            System.out.println("Enter value: ");
            A[i] = scan.nextInt();
        }
        System.out.println("Enter Number to replace:");
        int X = vallidation(scan);

        System.out.println(countMoves(A, N, X));

    }
    public static int countMoves(int A[], int N, int X){
        int count = 0; 
        for(int i=0;i<N;i++){
            if(A[i]!=X){
                A[i]=X;
                count++;
            }
        }
        return count;
    } 
    //int vallidation
    public static int vallidation(Scanner scan){
        int number;
        do{
            System.out.println("Enter Length: ");
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
