package AdvancedPrograms;

public class SortInteger2 {
    public static void main(String[] args) {
        int a[]={1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
        int temp = 0;

        int len=a.length;

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Elements are Sorted in Decending Order Is:");
        for(int i=len-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Elements are Sorted in Decending Order Is:");
        for(int i=0;i<len;i++){
            System.out.print(a[i]+" ");
        }
    
        
    }
}
