package ArrayAssignmentPrograms;

import java.util.Scanner;

public class FrequencyOfOddandEven32 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number Of Rows: ");
        int rows=scan.nextInt();
        System.out.println("Enter Number of Columns: ");
        int col=scan.nextInt();

        int a[][]=new int[rows][col];
        System.out.println("Enter values to Array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter value: ");
                a[i][j]=scan.nextInt();
            }
        }
        System.out.println("Input Matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int countOdd=0,countEven=0;
        System.out.println("Frequency of Odd and Even: ");

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(a[i][j]%2==0){
                    countEven++;
                }
                else{
                    countOdd++;
                }
            }
        }
        System.out.println("Even count: "+countEven);
        System.out.println("Odd count: "+countOdd);
        scan.close();
    }
}
