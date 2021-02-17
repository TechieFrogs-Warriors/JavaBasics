package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class SpiralModal12 {
    public static void spiral(int row,int col,int arr[][]){
        //declering variables
        int r=0,c=0,last_Row=row-1,last_Col=col-1;

        while(r<=last_Row&&c<=last_Col){    
            //first row printing
            for(int i=c;i<=last_Col;i++){
                System.out.print(arr[r][i]+" ");
            }
            r++;
            //last column printing
            for(int i=r;i<=last_Row;i++){
                System.out.print(arr[i][last_Col]+" ");
            }
            last_Col--;
            //last row Printing
            if(r<last_Row){
                for(int i=last_Col;i>=c;i--){
                    System.out.print(arr[last_Row][i]+" ");
                }
                last_Row--;
            }
            //first column
            if(c<last_Col){
                for(int i=last_Row;i>=r;i--){
                    System.out.print(arr[i][c]+" ");
                }
                c++;
            }

        }
    }
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        //length of matrix
        int row,col;
        do{
            System.out.println("Enter sizes of row and columns: ");
            while(!scan1.hasNextInt() | !scan2.hasNextInt()){
                System.out.println("Enter Integer Values Only: ");
                scan1.next();
                scan2.next();
            }
            row=scan1.nextInt();
            col=scan2.nextInt();
        }
        while(row<=0&col<=0);
        //create an array
        int arr[][]= new int[row][col];
        //assign Values to matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter value:");
                arr[i][j]=scan1.nextInt();
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
        System.out.println();
        //calling method
        spiral(row, col, arr);
        scan1.close();
        scan2.close();
    }
}
