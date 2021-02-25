package WiproPrograms;

import java.util.*;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int[] arr = new int[sc.nextInt()];
        // Taking input values one by one from user
        System.out.println("Enter elements into array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // To print all the taken input values
        System.out.println("The array elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int max = 0, num = 0;// inilizing the max and count values
        for (int i = 0; i < arr.length; i++) {
            int count = 1;// intilizing the count varaible
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])// if both the values are equal then count increments
                {
                    count++;
                }
            }
            if (max <= count) {
                max = count;// asiiging the bigger value to count
                num = arr[i];
            }

        }
        System.out.println("/nMost occured word is :: " + num);
        sc.close();

    }

}
