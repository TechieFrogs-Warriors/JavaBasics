public class Alphabetpattern24 {
    public static void main(String[] args) {
        String str = "JAVA";
        int n = str.length();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i * 2 - 1; k >= 1; k--) {
                System.out.print(str.charAt(i - 1));
            }
            System.out.println();
        }
    }
}
