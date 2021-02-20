package Arrayprogramms;

public class Multipleofmatrices {
    public static void main(String[] args) {
        // matrix 1
      int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
      // matrix 2
      int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };
      // result matrix
      int c[][] = new int[3][3]; // 3 rows and 3 columns
                                               
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            c[i][j] = 0;
            for (int k = 0; k < 3; k++) {
               c[i][j] += a[i][k] * b[k][j]; // multiply and print matrix
            }
            System.out.print(c[i][j] + " ");
         }
         System.out.println();
      }
        

        
        
    }
   
    
}
