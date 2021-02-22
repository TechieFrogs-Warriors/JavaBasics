package Arrayprogramms;

import java.util.Arrays;

public class Arrasspgm1 {
   

    public static void main(String[] args) {
        int[] a={2,2,3};
        int[] b=new int[a.length];
        b=Arrays.copyOf(a,a.length);
        System.out.println("values in b: ");
        for(int i=0;i<b.length;++i);
        System.out.print(b[i] + " ");
    }
    
}
