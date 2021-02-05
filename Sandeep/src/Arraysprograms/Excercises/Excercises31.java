package Arraysprograms.Excercises;

public class Excercises31 {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int row = arr.length;
        int col = arr[0].length;

        if (row != col) {
            System.out.println("Not square matrix");
        } else {
            System.out.println("Upper triangle matrix ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i > j) {
                        System.out.print("  ");
                    } else {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

}
