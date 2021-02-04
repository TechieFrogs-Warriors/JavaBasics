package Arraysprograms.Excercises;

public class Excercises28 {
    public static void main(String[] args) {
        int row, col, count = 0;

        int arr[][] = { { 10, 0, 0 }, { 0, 5, 9 }, { 0, 0, 7 } };

        row = arr.length;
        col = arr[0].length;

        int size = row * col;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0)// checking how many 0's are there
                {
                    count++;
                }
            }
        }
        if (count > (size / 2)) {// number of empty postions greater than non empty
            System.out.println("Matrix is a sparse Matrix");
        } else {
            System.out.println("Matrix is not a sparse matrix");
        }

    }

}
