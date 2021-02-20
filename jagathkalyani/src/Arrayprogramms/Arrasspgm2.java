package Arrayprogramms;


public class Arrasspgm2 {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1, 5, 7, 3, 5, 9, 8};
        int [] fr = new int [arr.length];
        int value = -1;
        for(int i = 0; i < arr.length; i++)
        {
        int count = 1;
        for(int j = i+1; j < arr.length; j++)
        {
        if(arr[i] == arr[j])
        {
        count++;
        fr[j] = value;
        }
        }
        if(fr[i] != value)
        fr[i] = count;
        }
        System.out.println(" Element - Frequency");
        for(int i = 0; i < fr.length; i++){
        if(fr[i] != value)
        System.out.println(" " + arr[i] + " - " + fr[i]);
        }
        
    }
    
}
