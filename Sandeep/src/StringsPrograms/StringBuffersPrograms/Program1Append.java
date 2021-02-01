package StringsPrograms.StringBuffersPrograms;

public class Program1Append {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Sai");
        StringBuffer s2 = new StringBuffer(" Maddipati");
        s1.append(" Sandeep");
        System.out.println(s1);
        System.out.println(s1.append(s2));

    }

}
