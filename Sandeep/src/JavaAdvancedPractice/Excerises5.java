package JavaAdvancedPractice;

public class Excerises5 {
    public static void main(String[] args) {
        int arr[][] = { { 88, 33, 69 }, { 85, 36, 4 }, { 2, 9, 54 } };
        int row = arr.length;
        int col = arr[0].length;
        int n1 = 0;
        int n2 = n1 + 1;

        System.out.println("Matrix before Sorting---");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = n1; j < n2; j++) {
                for (int k = 0; k < arr.length; k++) {
                    for (int l = n1; l < n2; l++) {
                        if (arr[i][j] < arr[k][l]) {
                            int temp = arr[k][l];
                            arr[k][l] = arr[i][j];
                            arr[i][j] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("\nMartx after sorting ---");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

    }

}
