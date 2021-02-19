public class Practice1 {
    public static void main(String[] args) {
        int ch = 0;
        for (int i = 5; i >= 0; i--) {
            for (int k = 5; k >= i; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= (i * 2); j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
