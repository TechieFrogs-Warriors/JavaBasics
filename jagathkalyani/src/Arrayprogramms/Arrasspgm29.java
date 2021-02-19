package Arrayprogramms;

public class Arrasspgm29 {
    public static void main(String[] args) {
        int A[][] = { {7, 9, 2}, {3, 8, 6}, {1, 4, 2} };
        int B[][] = { {7, 9, 2}, {3, 8, 6}, {1, 4, 2} };
        int value = 1;
        int n = 3;
        for (int i = 0; i < n; i++)
          for (int j = 0; j < n; j++)
            if (A[i][j] != B[i][j])
               value = 0;
            if (value == 1)
               System.out.print("Both the matrices are identical");
            else
               System.out.print("Both the matrices are not identical");
    }
    
}
