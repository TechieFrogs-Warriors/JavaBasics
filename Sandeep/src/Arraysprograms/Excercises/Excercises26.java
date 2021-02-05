package Arraysprograms.Excercises;

public class Excercises26 {
    public static void main(String[] args) {
        int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int a[][] = { { 11, 112, 13 }, { 14, 135, 16 }, { 17, 158, 129 } };
        int c[][] = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

}
