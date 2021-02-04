package Arraysprograms.Excercises;

public class Excercises38 {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Average  of elemnts in an array is : " + (sum / n));
    }

}
