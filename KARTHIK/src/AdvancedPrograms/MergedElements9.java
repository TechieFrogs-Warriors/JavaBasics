package AdvancedPrograms;

import java.util.Arrays;

public class MergedElements9 {
    public static void main(String[] args) {
        int a[]={ 1, 5, 6, 7, 8, 10 };
        int b[]={ 2, 4, 9 };

        int len1=a.length;
        int len2=b.length;

        System.out.println("Original Arrays:");
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
		
		merge(a, len1, b, len2);
        
		System.out.println("\nSorted Arrays:");
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));

    }
    static void merge(int a[],int len1,int b[],int len2){
        for(int i=0;i<len1;i++){
            if(a[i]>b[0]){
                int temp=a[i];
                a[i]=b[0];
                b[0]=temp;

                int k;
                int temp2=b[0];
                for(k=1;k<len2&&b[k]<temp2;k++){
                    b[k-1]=b[k];
                }
                b[k-1]=temp2;
            }
        }
    }
}
