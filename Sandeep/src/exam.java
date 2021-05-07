import java.util.Scanner;

public class exam {
    static int sumRow;
    static int sumCol;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading matrix size
        // System.out.println("matrix rowsize is:");
        int m = sc.nextInt();
        // System.out.println("matrix colsize is:");
        int n = 3;
        int[][] matarray = new int[m][n];
        // Reading elements into matrix
        // System.out.println("enter matrix elements");
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
                    if (matarray[x][y] == 0) {
                        matarray[x][y] = matarray[x][y] + 1;
                        int result = matarray[x][y];
                        while (result % 2 != 0) {

                            if ((result + sumRow) % 2 == 0) {
                                matarray[x][y] = result;
                                break;
                            } else {
                                result++;
                            }
                        }
                    }

                }
                if (sumRow > sumCol) {
                    if (matarray[x][y] == 0) {
                        matarray[x][y] = matarray[x][y] + 1;
                        int result2 = matarray[x][y];
                        while (result2 % 3 != 0) {

                            if ((result2 + sumRow) % 3 == 0) {
                                matarray[x][y] = result2;
                                break;
                            } else {
                                result2++;
                            }
                        }
                    }
                }

            }
        }
        // printing output
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(matarray[x][y] + " ");
            }
            System.out.println();
        }

    }
}
