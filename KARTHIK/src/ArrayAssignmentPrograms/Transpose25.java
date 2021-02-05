package ArrayAssignmentPrograms;

public class Transpose25 {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{4,5,6,7},{7,8,9,0},{8,5,4,6}};
        int b[][]=new int[a.length][a.length];
        System.out.println("Original Matrix: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                b[i][j]=a[j][i];
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    } 
}
