package ArrayAssignmentPrograms;

import java.util.Arrays;

public class DuplicateelementsRemove21 {
    public static void main(String[] args) {
        int a[]={85,45,78,85,85,78};
        
        int len=a.length;
        int temp[]=new int [a.length];
        int j=0;
        Arrays.sort(a);
        for(int i=0;i<len-1;i++){
            if(a[i]!=a[i+1]){
                temp[j++]=a[i];
            }
        }
        temp[j++]=a[len-1];
        System.out.println("Duplicate Of words: ");
        for(int k=0;k<j;k++){
            System.out.print(temp[k]+" ");
        }
    }
    
}
