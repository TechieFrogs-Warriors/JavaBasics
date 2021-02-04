package Arraysprograms.Excercises;

public class Excercises2 {
    public static void main(String[] args) {
        int arr[] = new int[] { 77, 5, 6, 9, 5, 3, 2, 8, 1, 2, 5, 7, 88, 99, 66, 88 };
        int frequency[] = new int[arr.length];
        int count;

        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = -1;
                }
            }
            if (frequency[i] != -1) {
                frequency[i] = count;
            }
        }
        System.out.println("Frequency of elemts are ");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != -1) {
                System.out.println("number : " + arr[i] + "Frequency : " + frequency[i]);
            }
        }
    }

}
