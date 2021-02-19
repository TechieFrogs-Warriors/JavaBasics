package StringsPrograms.StringBuffersPrograms;

public class Program18Build {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("Sai Venkata Krishna Sandeep");
        System.out.println(s1.substring(11));// op--" Krishna Sandeep"
        System.out.println(s1.substring(3, s1.length()));// op--" Venkata Krishna Sandeep"

        System.out.println("\n\n Subsequence \n");
        System.out.println(s1.subSequence(11, s1.length()));// Krishna Sandeep

        System.out.println("\n\n\t\t\tTrim \n");
        StringBuilder s2 = new StringBuilder(" Sai Venkata Krishna Sandeep ");
        // System.out.println(s1.trimToSize());
        s2.trimToSize();
        System.out.println(s1);

    }

}
