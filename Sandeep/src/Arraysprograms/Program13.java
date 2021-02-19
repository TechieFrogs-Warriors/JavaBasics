package Arraysprograms;

public class Program13 {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Class obj = arr.getClass();
        String name = obj.getName();
        System.out.println(name);
        int arr1[][] = new int[10][10];
        int arr2[][] = new int[100][100];
        arr1 = arr2;
        System.out.println(arr1.length);
        int arr3[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr4[][] = new int[][] { { 1, 2 }, { 5, 6 } };
        arr3 = arr4;
        System.out.println(arr3[1][1]);

    }

}
