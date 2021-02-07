package ArrayAssignmentPrograms;

public class SubstractTwoMatrices26 {
    public static void main(String[] args) {
        int a[][]={{56,85,87},{90,78,45},{89,52,45}};
        int b[][]={{52,42,52},{8,19,12},{63,25,48}};
        int c[][]=new int[a.length][b.length];
        System.out.println("Substraction of Two Arrays: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                c[i][j]=a[i][j]-b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
