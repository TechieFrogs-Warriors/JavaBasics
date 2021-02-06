package ArrayAssignmentPrograms;

public class MultiplyJaggedArrays35 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{1,2,3,4,5},{1,2,3}};
        int b[][]={{1,2,3},{1,2,3,4,5},{1,2,3}};

        int rows=a.length;
        int col=a[0].length;
        int c[][]=new int[rows][col];

        System.out.println("Multiplication matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                c[i][j]=0;
                for(int k=0;k<col;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
