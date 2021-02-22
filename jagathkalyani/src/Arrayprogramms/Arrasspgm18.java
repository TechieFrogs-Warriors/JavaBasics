package Arrayprogramms;


public class Arrasspgm18 {
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,30,60,50,40};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("largest number in an array : " +max);
    }
    
}
