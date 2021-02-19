package AssignmentPrograms;

import java.util.*;

public class Program8 {
    public static int row = 0;

    public static void main(String[] args) {
        // input array with elemnets
        int arr[] = { 5, 4, 3, 5, 3, 3, 3, 1, 1, 3 };
        // array that holds element and its frequency value
        int newArr[][] = new int[arr.length][2];

        // sorting array using Arrays.sort()
        Arrays.sort(arr);

        // Logic for sorting
        newArr[row][0] = arr[0];// placing first element of sorted array into the new array as first value

        // To enter remaining elements into the array (newArr)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])// checks if the same value then this condition excutes
            {
                // incrementing second coloumn
                newArr[row][1] = newArr[row][1] + 1;
            } else {
                // iff values not same going to next row by incrementing and placing that
                // element into that next row
                row++;
                newArr[row][0] = arr[i];
            }
        }
        // to know number of rows
        row++;
        System.out.println("number of rows " + row);
        // calling method to sort multidimensional(newArr) array
        newArr = sort(newArr);

        // printing descended array elemnts based on frequency as output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= newArr[i][1]; j++) {
                System.out.print(newArr[i][0] + " ");// printing the sorted elemts by the frequency
            }
        }
        System.out.println();

    }

    public static int[][] sort(int newArr[][]) {
        int temp[] = new int[2];// intilozing te temperary array for sorting

        for (int i = 0; i < row; i++) {
            for (int j = i; j < row; j++) {
                if (newArr[i][1] < newArr[j][1])// for sorting
                {
                    temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        return newArr;
    }

}
