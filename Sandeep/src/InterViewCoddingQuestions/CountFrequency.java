package InterViewCoddingQuestions;

import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array :: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter elements in array :: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freqMap = solveIterative(arr);

        for (int val : freqMap.keySet()) {
            System.out.println("Frequency of " + val + " is : " + freqMap.get(val));
        }

    }

    public static HashMap<Integer, Integer> solveIterative(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        /*
         * iterate through the array for contributing +1 as a frequency of that element,
         * every time it is encountered.
         */
        for (int val : arr) {
            if (!freqMap.containsKey(val)) {
                /*
                 * if hashmap doesnt contains that element, this means this is the first time
                 * the element is encountered, therefor freq of this element will be one for
                 * now.
                 */
                freqMap.put(val, 1);
            } else {
                /*
                 * if hashmap contains this element, so now its updated frequency will be its
                 * past frequency + 1.
                 */
                freqMap.put(val, freqMap.get(val) + 1);
            }
        }
        return freqMap;
    }
}
