
package AdvancedPrograms;

import java.util.Arrays;

public class LargeSmall10 {
    public static void main(String[] args) {
        int a[]={5, 8, 1, 4, 2, 9, 3, 7, 6};
        int len=a.length;

        Element(a,len);
    }
    static void Element(int a[], int n) 
    {     
        Arrays.sort(a); 
       
        int[] temp = new int[n];  
        int Index = 0;   
        for (int i = 0, j = n-1; i <= n / 2 || j > n / 2;i++, j--) { 
            if(Index < n) 
            { 
                temp[Index] = a[i]; 
                Index++; 
            } 
              
            if(Index < n) 
            { 
                temp[Index] = a[j]; 
                Index++; 
            } 
        }
        System.out.println("Large And Small Elements: ");  
        for (int i = 0; i < n; i++){
            a[i] = temp[i];
            System.out.print(a[i]+" ");
        }
    } 
}

