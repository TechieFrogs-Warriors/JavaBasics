package WiproPrograms.WiproAdvanced;

import java.util.*;

public class Program1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // intilizinh the array size
        System.out.println("Enter size of the array :: ");// intilizing the size
        int size = sc.nextInt();

        // intilizing the elemnts in the array
        System.out.println("Enter elemnts in the array :: ");
        int arr[] = new int[size];// intilizingteh array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        int temp[] = new int[size];
        // segargating the +ve numbers in an new array
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        // displaying the +ve array
        System.out.println("Dispalying the +ve array");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }

        int n = j;// j value till where th e+ve integers are stored
        int total = (n + 1) * (n + 2) / 2;// formula for calculating sum of natural numbers

        for (int i = 0; i < j; i++) {
            total -= temp[i];
        }
        System.out.println("Missing number is :: " + total);

    }
}
