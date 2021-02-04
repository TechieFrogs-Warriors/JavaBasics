package Arraysprograms.Excercises;

public class Excercises6 {
    public static void main(String[] args) {
        int arr[] = new int[] { 22, 33, 44, 55, 66, 77, 88, 99 };

        System.out.println("Original array elements are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nReverse order of elemnts in array are ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

}
