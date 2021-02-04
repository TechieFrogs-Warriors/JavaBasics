package Arraysprograms.Excercises;

public class Excercises11 {
    public static void main(String[] args) {
        int arr[] = new int[] { 22, 33, 44, 55, 66, 77, 88, 99, 11, 222, 5858, 5, 6, 8 };
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println("Number of Elemnts in Array is :" + count);
    }

}
