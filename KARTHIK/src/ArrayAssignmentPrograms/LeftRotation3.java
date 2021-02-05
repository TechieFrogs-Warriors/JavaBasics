package ArrayAssignmentPrograms;

public class LeftRotation3 {
    public static void main(String[] args) {
        int a[]={97,12,98,8,12,17};
        int l=a.length;
        int r=3;

        
        while(r>0){
            int temp=a[0];//store 1st value
            for(int i=1;i<l;i++){//left rotation once
                a[i-1]=a[i];
            }
            a[l-1]=temp;//assign first value to last of an array
            r--;
        }
        System.out.println("Left Rotation :");
        for(int ch:a){
            System.out.print(ch+" ");
        }
    }
    
    
}
