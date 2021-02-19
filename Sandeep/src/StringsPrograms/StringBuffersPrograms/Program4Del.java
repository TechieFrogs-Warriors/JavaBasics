package StringsPrograms.StringBuffersPrograms;

public class Program4Del {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Sai Sandeep Maddipati");
        System.out.println(s1.delete(0, 3));// op--" Sandeep Maddiapti"
        System.out.println(s1.deleteCharAt(0));// op-- "Sandeep Maddipati"
        System.out.println(s1.deleteCharAt(7));
    }

}
