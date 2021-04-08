package InterViewCoddingQuestions;

import java.util.*;

public class NumberOcuuranceOddNumberOfTimes {
    static int odd_occurs(int my_arr[], int arr_size) {
        int i;
        for (i = 0; i < arr_size; i++) {
            int count = 0;
            for (int j = 0; j < arr_size; j++) {
                if (my_arr[i] == my_arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return my_arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int my_arr[] = new int[] { 56, 99, 99, 34, 55, 99, 90, 11, 12, 11, 11, 34, 1, 1, 1 };
        int arr_size = my_arr.length;
        System.out.println("The number that occurs odd number of times in the array is ");
        System.out.println(odd_occurs(my_arr, arr_size));
    }

}
