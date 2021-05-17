package Java_Interview_programs;
import java.util.*;
//Count number of occurrences (or frequency) of each element in a sorted array
public class FrequencyOfElements {
    public static void main(String[] args) {
 
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size:");
        int[] arr = new int[scn.nextInt()];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
 
        //displaying output
        HashMap<Integer, Integer> freqMap = frequencyCheck(arr);
 
        for(int val : freqMap.keySet())
        {
            System.out.println("Frequency of " + val + " is : " + freqMap.get(val));
        }
        scn.close();
 
    }
 
    public static HashMap<Integer, Integer> frequencyCheck(int[] arr)
    {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
 
        /* iterate through the array for contributing +1 
         * as a frequency of that element, every time it is encountered.*/
        for(int val : arr)
        {
            if(!freqMap.containsKey(val))
            {
                /* if hashmap doesnt contains that element, 
                 * this means this is the first time the element is encountered,
                 * therefore freq of this element will be one for now.*/
                freqMap.put(val, 1);
            }
            else {
                /* if hashmap contains this element, 
                 * so now its updated frequency will be its past frequency + 1.
                 */
                freqMap.put(val, freqMap.get(val)+1);
            }
        }   
        return freqMap;
    }
    
}

