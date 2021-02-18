package AssignmentPrograms;

public class Program17 {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {// rows
            for (int j = 0; j < 3; j++) {// colums
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {// this loop is used to muiltply evaey cloum and row
                    c[i][j] += a[i][k] * b[k][j];// formula for multiplication
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        int maxvalue = Integer.MIN_VALUE;
        // code of the checking for the maximum value
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (c[i][j] > maxvalue) {
                    maxvalue = c[i][j];
                }
            }
        }
        System.out.println("the maximum product of values is :: " + maxvalue);
    }

}
