package Arraysprograms.Excercises;

public class Excercises46 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 7, 8, 9, 10, 11 };

        int arr[] = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, arr, 0, arr1.length);

        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
