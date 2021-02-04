package Arraysprograms.Excercises;

public class Excercises43 {
    public int[][] multiplyMatrices(int[][] a, int[][] b, int row, int col) {
        int c[][] = new int[row][col];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {// this loop is used to muiltply evaey cloum and row
                    c[i][j] += a[i][k] + b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        return c;
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int c[][] = new int[3][3];
        int row = 3, col = 3;
        Excercises43 obj = new Excercises43();

        obj.multiplyMatrices(a, b, row, col);

    }

}
