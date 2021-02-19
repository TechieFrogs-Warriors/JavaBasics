package Arraysprograms.Excercises;

public class Excercises29 {
    public static void main(String[] args) {

        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 1, 8, 9 } };

        int equal = 1;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    equal = 0;
                    break;
                }
            }
        }
        if (equal == 1) {
            System.out.println("Matrices are equal");
        } else {
            System.out.println("Matrices are not equal");
        }

    }

}
