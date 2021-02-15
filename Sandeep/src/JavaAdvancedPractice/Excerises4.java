package JavaAdvancedPractice;

//import java.util.Arrays;

public class Excerises4 {
    public static void main(String[] args) {
        int arr[][] = { { 12, 33, 69 }, { 85, 36, 4 }, { 2, 9, 54 } };
        int row = arr.length;
        int col = arr[0].length;

        System.out.println("Matrix before Sorting---");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // code for sorting
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < row; k++) {
                    for (int l = 0; l < col; l++) {
                        if (arr[i][j] < arr[k][l]) {
                            int temp = arr[k][l];
                            arr[k][l] = arr[i][j];
                            arr[i][j] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("\nMartx after sorting ---");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
