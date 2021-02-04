package Arraysprograms.Excercises;

public class Excercises4 {
    public static void main(String[] args) {
        int arr[] = new int[] { 22, 33, 44, 55, 66, 77, 88, 99, 11, 22, 33, 55, 6, 8 };

        System.out.println("Dublictes Numbers in an array are ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }

}
