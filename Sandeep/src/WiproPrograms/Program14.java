package WiproPrograms;

import java.util.*;

public class Program14 {
    public static void main(String[] args) {
        int n = 3, m = 3;
        int arr[][] = { { 1, 5, 6 }, { 3, 2, 5 }, { 8, 6, 4 } };

        System.out.println("Elemnts in an matrix are ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The minimum pofit is");
        for (int i = 0; i < arr.length; i++) {// row
            int min = arr[0][i];

            for (int j = 1; j < arr[i].length; j++) {// colum
                if (arr[i][j] < min) {// checking for the minimum value
                    min = arr[i][j];
                }
            }
            System.out.print(min + "  ");

        }
    }

}
