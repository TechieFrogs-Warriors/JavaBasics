package AssignmentPrograms;

public class Program10 {
    public void sortRow(int m[][]) {
        // loop for rows
        for (int i = 0; i < m.length; i++) {
            // loop for columns
            for (int j = 0; j < m[i].length; j++) {
                // loop for comaprision an dswapping in each row
                for (int k = 0; k < m[i].length - j - 1; k++) {
                    if (m[i][k] > m[i][k + 1])// it checks every number and swap if less
                    {
                        // swapping the  numbers
                        int temp = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = temp;
                    }
                }
            }
        }
        // for printing sorted array
        System.out.println("Array after sorting \n");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // main method
    public static void main(String[] args) {
        // intilizing the elemts in matrix
        int m[][] = { { 66, 99, 55 }, { 78, 36, 52 }, { 8, 2, 0 } };
        // prining the maxtrix before sorting
        System.out.println("Array before sortting \n");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }
        Program10 obj = new Program10();// crrating obect
        obj.sortRow(m);// calling method using object

    }

}
