package Arraysprograms.Excercises;

public class Excercises48 {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 6, 5, 4, 9, 8, 7, 10, 11, 22, 33, 66, 88 };

        int n = 828;

        int find = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                find = 1;
            }
        }
        if (find == 1) {
            System.out.println("value contains in array");
        } else {
            System.out.println("value does not contain in array");
        }
    }

}
