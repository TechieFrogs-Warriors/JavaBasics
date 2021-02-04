package Arraysprograms.Excercises;

//import org.apache.commons.lang3.ArrayUtils;

public class Excercises21 {
    public static void main(String[] args) {
        int arr[] = new int[] { 22, 33, 5, 44, 55, 66, 77, 5, 6, 22, 8 };
        System.out.println("Elements in array before removing dublicates ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    // arr = ArrayUtils.remove(arr, j);
                }
            }
        }
        System.out.println("\n\nArray after removing Dublicate elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
