package ArrayAssignmentPrograms;

public class OddAndEven22 {
    public static void main(String[] args) {
        int a[]={96,183,124,125,163,126};
        System.out.println("Even Numbers: ");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
        System.out.println("Odd Numbers: ");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
    }
}
