package Arraysprograms.Excercises;

public class Excercises32 {
    public static void main(String[] args) {
        int arr1[][] = { { 1, 2, 3 }, { 4, 12, 6 }, { 44, 8, 9 } };
        int row = arr1.length;
        int col = arr1[0].length;
        int efrequency = 0, ofrequency = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr1[i][j] % 2 == 0) {
                    efrequency++;
                } else if (arr1[i][j] % 2 != 0) {
                    ofrequency++;
                }
            }
        }
        System.out.println("frequency of even numbers : " + efrequency);
        System.out.println("frequency of odd numbers : " + ofrequency);
    }

}
