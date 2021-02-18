package AssignmentPrograms;

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        // input validation
        do {
            System.out.println("Enetr String: ");
            while (!sc.hasNext("[A-Za-z]*")) {// String Regular expression
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            str = sc.nextLine();
        } while (str.equals(""));
        System.out.println("Enter  String Is valid " + str);

        int[] freq = new int[str.length()];
        char minChar, maxChar;
        minChar = maxChar = str.charAt(0);
        int i, j, min, max;

        // converting given string to lowe cases
        str = str.toLowerCase();
        // Converts given string into character array
        char arr[] = str.toCharArray();

        // Count each word in given string and store in array freq
        for (i = 0; i < arr.length; i++) {
            freq[i] = 1;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != ' ' && arr[i] != '0') {
                    freq[i]++;

                }
            }
        }

        // Determine minimum and maximum occurring characters
        min = max = freq[0];
        for (i = 0; i < freq.length; i++) {

            // If min is greater than frequency of a character then, store frequency in min
            // and corresponding character in minChar
            if (min > freq[i]) {
                min = freq[i];
                minChar = arr[i];
            }
            // If max is less than frequency of a character then, store frequency in max and
            // corresponding character in maxChar
            if (max < freq[i]) {
                max = freq[i];
                maxChar = arr[i];
            }
        }

        System.out.println("Minimum occurring character: " + minChar);
        System.out.println("Maximum occurring character: " + maxChar);

        sc.close();
    }

}
