public class Practiceexp {
    public static void main(String[] args) {
        int n = 2112;

        int rev = 0, rem, temp = n;

        while (n != 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;

        }
        if (temp == rev) {
            System.out.println("its is a plindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

}
