package Array_Concept;

import java.nio.ByteBuffer;
import java.util.*;

//import org.apache.commons.lang3.ArrayUtils;
//import org.apache.commons.lang3.StringUtils;


public class Practice2 
{
    public static void main(String[] args) 
    {
        /* Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int arr[]=new int[sc.nextInt()];
        System.out.println("Enter elements in array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("array elements are: ");

        for(int j:arr)
        {
            System.out.println(j);
        } */

                 //printing arrays
        int[] intArray = { 1, 2, 3, 4, 5 };
        String intArrayString = Arrays.toString(intArray);
         
        // printing  directly will print reference value
        System.out.println(intArray);// [I@7150bd4d
        
         //printing after using tostring
        System.out.println(intArrayString);// [1, 2, 3, 4, 5]

        //concatinating arrays
        int[] intArray1 = { 1, 2, 3, 4, 5 };
        int[] intArray2 = { 6, 7, 8, 9, 10 };
        // Apache Commons Lang library
        //int[] combinedIntArray = ArrayUtils.addAll(intArray1, intArray2);

        //declaring array inline(inside a method)
        //  method(new String[]{"a", "b", "c", "d", "e"});

        //join elements of array into single string
        // containing the provided list of elements
        // Apache common lang
        //String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
       // System.out.println(j);// a, b, c

        //remove an element of array
        int[] intArrays = { 1, 2, 3, 4, 5 };
        //int[] removed = ArrayUtils.removeElement(intArrays, 3);//create a new array
        //System.out.println(Arrays.toString(removed));

        //reverse an array
        int[] intArrayss = { 1, 2, 3, 4, 5 };
        //ArrayUtils.reverse(intArrayss);
        System.out.println(Arrays.toString(intArrayss));//[5, 4, 3, 2, 1]
        

        //convert int to byte array
        byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();
        for (byte t : bytes) {
        System.out.format("0x%x ", t);
        }

        //create an array list from array
        String[] stringArray = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList);// [a, b, c, d, e]

        //check if array contains a value
        String[] stringArrays = { "a", "b", "c", "d", "e" };
        boolean b = Arrays.asList(stringArrays).contains("a");
        System.out.println(b);// true

        //convert arraylist to array
        String[] stringArrayss = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList1 = new ArrayList<String>(Arrays.asList(stringArrayss));
        String[] stringArr = new String[arrayList1.size()];
        arrayList1.toArray(stringArr);
        for (String s : stringArr)
	    System.out.println(s);

        //convert array to set
        Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
        System.out.println(set);//[d, e, b, c, a]
        
    }
    
}
