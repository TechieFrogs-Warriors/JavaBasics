package InterViewCoddingQuestions;

import java.util.*;

/*
Algorithm
1. Sort the elements in the array
2. Till the end of the sorted array, do linear scan
a. If the difference between the current element and the next element is anything other than     1, then print all elements are not consecutive
else,
b. If all differences are 1, then print all elements are consecutive.
*/
public class CheckArrayElementsAreConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array :: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter Elements in the array :: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int temp = 0;
        for (int i = 0; i < size - 1; i++)
            if (a[i + 1] > a[i] + 1) {
                System.out.println(" Not all consecutive elements");
                temp = 1;
                i = size;
            }
        if (temp == 0)
            System.out.println("Consecutive element set");
    }
}
