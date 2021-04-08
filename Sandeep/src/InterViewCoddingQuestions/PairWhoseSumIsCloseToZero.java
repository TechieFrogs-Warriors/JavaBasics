package InterViewCoddingQuestions;

import java.util.*;
import java.lang.*;

public class PairWhoseSumIsCloseToZero {
    public static void main(String[] args) {
        int arr[] = { 1, 5, -4, 7, 8, -6 };
        int size = arr.length;
        int min_sum, sum, min_left_num, min_right_num;

        if (size < 2) {
            System.out.println("Invalid Input");
            return;
        }

        min_left_num = 0;
        min_right_num = 1;
        min_sum = arr[0] + arr[1];

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                sum = arr[i] + arr[j];
                if (Math.abs(min_sum) > Math.abs(sum)) {
                    min_sum = sum;
                    min_left_num = i;
                    min_right_num = j;
                }
            }
        }

        System.out.println("Two elements whose sum is minimum are " + arr[min_left_num] + " and " + arr[min_right_num]);
    }
}
