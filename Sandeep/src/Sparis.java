import java.util.*;

public class Sparis {
    static int sumRow;
    static int sumCol;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading matrix size
        System.out.println("matrix size is:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matarray = new int[m][n];
        // Reading elements into matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matarray[i][j] = sc.nextInt();
            }
        }
        // checking if sparse or not
        int counter = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matarray[i][j] == 0)
                    counter++;
            }
        }

        if (counter < ((m * n) / 2)) {
            System.out.println("-1");
        }

        // Calculates sum of each row of given matrix

        for (int i = 0; i < m; i++) {
            sumRow = 0;
            for (int j = 0; j < n; j++) {
                sumRow = sumRow + matarray[i][j];
            }

        }
        for (int k = 0; k < n; k++) {
            sumCol = 0;
            for (int j = 0; j < m; j++) {
                sumCol = sumCol + matarray[j][k];
            }
        }

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (sumRow < sumCol) {
                    matarray[x][y] = matarray[x][y] + 1;
                    int result = matarray[x][y] + sumRow;
                    while (result % 2 != 0)
                        if (result % 2 == 0) {
                            matarray[x][y] = result;
                        } else {
                            result++;
                        }
                }

            }
        }
        // printing the result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matarray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
