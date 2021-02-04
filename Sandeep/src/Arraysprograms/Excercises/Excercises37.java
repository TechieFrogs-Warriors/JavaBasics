package Arraysprograms.Excercises;

public class Excercises37 {
    public static void main(String[] args) {
        int arr[][] = new int[4][];
        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[1];
        arr[3] = new int[3];

        int count = 0;// intilizing jagged array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int arr1[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };

        int arr2[][] = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[i][j] = arr1[i][j] + arr[i][j];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

}
