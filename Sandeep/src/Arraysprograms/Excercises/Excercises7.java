package Arraysprograms.Excercises;

public class Excercises7 {
    public static void main(String[] args) {
        int arr[] = new int[] { 22, 33, 44, 55, 66, 77, 88, 99, 11, 222, 5858, 5, 6, 8 };
        System.out.println("Elemnts Present in Even Position in array are ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

}
