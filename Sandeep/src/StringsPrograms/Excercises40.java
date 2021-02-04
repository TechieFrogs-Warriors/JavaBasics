package StringsPrograms;

public class Excercises40 {
    public static void main(String[] args) {
        String s1 = "Iam Maddipati Sai Venkata Krishna Sandeep";
        char ch = 'a';
        s1 = s1.toLowerCase();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (ch == s1.charAt(i)) {
                count++;
            }
        }
        System.out.println("Frequency of " + ch + " : " + count);
    }

}
