package StringsPrograms.StringBuffersPrograms;

public class Program11Build {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Sai");
        StringBuilder s2 = new StringBuilder(" Maddipati");
        s1.append(" Sandeep");
        System.out.println(s1);
        System.out.println(s1.append(s2));

    }

}
