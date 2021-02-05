package ArrayAssignmentPrograms;

public class RightRotation13 {
    public static void main(String[] args) {
        int[] a={12,8,19,17,98,97,6};

        int r=3;
        int i;
        while(r>0){
            int lastElement=a[a.length-1];
            for( i=a.length-1;i>0;i--){
                a[i]=a[i-1];
            }
            a[i]=lastElement;
            r--;
        }
        for(int ch:a){
            System.out.print(ch+" ");
        }

    }
}
