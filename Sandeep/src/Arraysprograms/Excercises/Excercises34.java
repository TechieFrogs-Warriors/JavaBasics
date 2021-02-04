package Arraysprograms.Excercises;

public class Excercises34 {
    public static void main(String[] args) {
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int row = arr1.length;
        int col = arr1[0].length;
        int sumr, sumc;

        for (int i = 0; i < row; i++) {
            sumr = 0;
            sumc = 0;
            for (int j = 0; j < col; j++) {
                sumr += arr1[i][j];
                sumc += arr1[j][i];
            }
            System.out.println("sum of row : " + (i + 1) + " is : " + sumr);
            System.out.println("sum of colum : " + (i + 1) + " is " + sumc);
        }
    }

}
