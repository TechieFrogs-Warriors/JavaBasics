package ArrayAssignmentPrograms;

public class LargestNumber {
    public static void main(String[] args) {
        int a[]={12,78,58,52};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Largest Number: "+a[a.length-1]);
    }
}
