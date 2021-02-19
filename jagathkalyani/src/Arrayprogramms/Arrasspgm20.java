package Arrayprogramms;

public class Arrasspgm20 {
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,30,60,50,40};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("smallest number in an array : " +min);
        
    }
    
}
