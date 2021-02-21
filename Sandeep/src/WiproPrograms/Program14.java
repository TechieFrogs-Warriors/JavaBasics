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

    public static void minProfit(int mat[][], int m, int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            int min = mat[0][i];
            for (j = 1; j < m; j++) {
                if (mat[j][i] < min) {
                    min = mat[j][i];
                }
            }
            System.out.print(min + " ");
        }
    }

    public static void main(String[] args) {
        int col, row;
        // Reading input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the size of the matrix :");
        row = inputValidation(sc);
        col = inputValidation(sc);

        int[][] mat = new int[row][col];// Input array

        // Taking input into matrix
        System.out.print("\nEnter the matrix elements : ");
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat[i][j] = inputValidation(sc);
            }
            System.out.println();
        }

        // Printing the matrix
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {

                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Minimum elements of each coloumn are: ");
        minProfit(mat, row, col); // Logic method
    }

}
