package InterViewCoddingQuestions;

import java.util.*;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int size, j = 0, k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array array :: ");
        size = sc.nextInt();
        int arr[] = new int[size];
        int odd[] = new int[size];
        int even[] = new int[size];
        System.out.println("Enter elements in the array :: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                odd[j] = arr[i];
                j++;
            } else {
                even[k] = arr[i];
                k++;
            }
        }
        System.out.print("Odd jumbers are :: ");
        if (j > 1) {
            for (int i = 0; i < (j - 1); i++) {
                System.out.print(odd[i] + ",");
            }
            System.out.print(odd[j - 1]);
        } else {
            System.out.println("No odd number");
        }
        System.out.println("");
        System.out.print("Even numbers are :: ");
        if (k > 1) {
            for (int i = 0; i < (k - 1); i++) {
                System.out.print(even[i] + ",");
            }
            System.out.print(even[k - 1]);
        } else {
            System.out.println("No even number");
        }
    }
}
