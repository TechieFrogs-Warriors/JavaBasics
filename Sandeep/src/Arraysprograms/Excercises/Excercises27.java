package Arraysprograms.Excercises;

public class Excercises27 {
    public static void main(String[] args) {

        int row, col;
        int identity = 1;

        int arr[][] = { { 1, 0, 1 }, { 0, 1, 0 }, { 0, 0, 1 } };

        row = arr.length;
        col = arr.length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j && arr[i][j] != 1) {
                    identity = 0;
                }
                if (i != j && arr[i][j] != 0) {
                    identity = 0;
                }
            }
        }
        if (identity == 1) {
            System.out.println("The matrix is an identity");
        } else {
            System.out.println("The matrix is not an identity");
        }

    }

}
