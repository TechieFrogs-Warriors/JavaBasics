package Arrayprogramms;
import java.util.*;

public class Arrasspgm14_15 {
    public static void main(String[] args) {
        int arr[]={2,7,9,4,5};
        Arrays.sort(arr);
        System.out.println("assending order : ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("decending order : ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
    
}
