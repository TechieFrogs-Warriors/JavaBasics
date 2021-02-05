package ArrayAssignmentPrograms;

import java.util.Arrays;

public class SortDecending15 {
    public static void main(String[] args) {
        int a[]={5,15,7,45,10,11};
        Arrays.sort(a);
        System.out.println("Decending order: ");
        for (int i = a.length-1; i >= 0; i--) {  
            System.out.print(a[i] + " "); 
        }
    }
    
}
