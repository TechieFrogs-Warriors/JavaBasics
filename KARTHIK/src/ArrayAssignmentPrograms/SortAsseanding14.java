package ArrayAssignmentPrograms;

import java.util.Arrays;

public class SortAsseanding14 {
    public static void main(String[] args) {
        int a[]={5,15,7,45,10,11};
        Arrays.sort(a);
        System.out.println("Ascending order: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}