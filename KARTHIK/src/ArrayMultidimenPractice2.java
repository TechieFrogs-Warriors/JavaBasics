public class ArrayMultidimenPractice2 {
    public static void main(String[] args) {
        //Multiplication Of 2-D arrays
        int [][] a={{3,4,5,6},{4,5,6,7},{1,2,3,4},{3,4,5,8}};
        int [][] b={{5,6,7,8},{5,6,4,7},{1,2,3,4},{4,3,2,1}};
        int [][] c=new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                c[i][j]=0;
                for(int k=0;k<a.length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
