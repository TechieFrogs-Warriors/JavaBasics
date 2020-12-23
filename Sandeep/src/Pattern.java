public class Pattern {
    public static void main(String[] args) {
        System.out.println("------ * patern accending --------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------ * patern decending --------");
        int k = 6;
        for (int i = 1; i <= k; i++) {
            for (int j = k; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------ number pattern -----------");
        int a = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

}
