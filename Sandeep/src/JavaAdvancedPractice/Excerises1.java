package JavaAdvancedPractice;

public class Excerises1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 7, 8 };
        int sum = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found at index " + i + " and " + j);
                } else {
                    System.out.println("pair not found ");
                }
            }
        }

    }

}
