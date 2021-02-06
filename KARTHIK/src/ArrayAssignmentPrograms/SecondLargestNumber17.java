package ArrayAssignmentPrograms;

import java.util.Arrays;

public class SecondLargestNumber17 {
    public static void main(String[] args) {
        int a[]={5,15,7,45,10,11};
        Arrays.sort(a);
        System.out.println("Largest 2rd number: "+a[a.length-2]);
    }
}
