package Arraysprograms.Excercises;

public class Excercises17 {
    void max(int arr[]) {

        int temp;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        System.out.println("Largest value is : " + arr[size - 2]);

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 22, 33, 44, 55, 66, 77, 88, 99, 11, 222, 5858, 5, 6, 8 };
        Excercises17 obj = new Excercises17();
        obj.max(arr);
    }

}
