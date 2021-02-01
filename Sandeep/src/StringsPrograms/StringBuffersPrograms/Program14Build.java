package StringsPrograms.StringBuffersPrograms;

public class Program14Build {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("Sai Sandeep Maddipati");
        System.out.println(s1.delete(0, 3));// op--" Sandeep Maddiapti"
        System.out.println(s1.deleteCharAt(0));// op-- "Sandeep Maddipati"
        System.out.println(s1.deleteCharAt(7));
    }

}
