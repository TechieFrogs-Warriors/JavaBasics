package Arraysprograms.Excercises;

public class Excercises35 {
    public static void main(String[] args) {
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int arr2[][] = new int[3][3];

        System.out.println("Original matrix");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = arr1[j][i];// formula of transpose
            }
        }
        System.out.println("\n\nMatrix after transpose");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }

}
