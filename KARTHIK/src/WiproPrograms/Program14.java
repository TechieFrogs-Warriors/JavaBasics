package WiproPrograms;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int row = vallidation(scan);
        System.out.println("Enter col Size: ");
        int col = vallidation(scan);
        //create 2_d array
        int arr[][]=new int[row][col];
        //assaign values to an arraay
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter Value:");
                arr[i][j]=scan.nextInt();
            }
            System.out.println();
        }
        //print input matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //minimum number in column
        try{
            miniNumber(arr,row,col);
        }catch(IndexOutOfBoundsException e){
            System.out.println("output");
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
    //minimum column finding method
    public static void miniNumber(int arr[][], int row, int col)
    {
        for(int i = 0; i < row; i++)
        {
            int min = arr[0][i];
            for(int j = 1; j <=col; j++)
            {   
                if(arr[j][i] < min)
                {
                    min = arr[j][i];
                }
            }
            System.out.print(min+" ");
        }   
    }

}
