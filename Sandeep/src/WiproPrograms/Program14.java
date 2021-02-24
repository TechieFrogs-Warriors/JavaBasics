package WiproPrograms;

import java.util.*;

public class Program14 {
    public static int inputValidation(Scanner sc) {
        int size;
        do {

            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            size = sc.nextInt();
        } while (size < 0);

        return size;
    }

    // method for finding the minimum value
    public static void minProfit(int mat[][], int m, int n) {
        int i, j;
        for (i = 0; i < n; i++) {// loop for rows
            int min = mat[0][i];// it itertes every row's colum
            for (j = 1; j < m; j++) {// for colum
                if (mat[j][i] < min) {// checks minimum value
                    min = mat[j][i];// assigns minmum value to a variabe
                }
            }
            System.out.print(min + " ");// prints valibale
        }
    }

    public static void main(String[] args) {
        int col, row;
        // Reading input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the size of the matrix :");
        row = inputValidation(sc);// validating input
        col = inputValidation(sc);// validating input

        int[][] mat = new int[row][col];// intilizing input matrix

        // intilizing values into matrix
        System.out.print("\nEnter the matrix elements : ");
        int i, j;
        for (i = 0; i < row; i++) {// rows
            for (j = 0; j < col; j++) {// colums
                mat[i][j] = inputValidation(sc);// validating
            }
            System.out.println();
        }

        // Printing the elemnts of matrix
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {

                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Minimum elements of each coloumn are: ");
        minProfit(mat, row, col); // methoid for finding the minimum value in each colum
    }

}
