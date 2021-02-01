package StringsPrograms.StringBuffersPrograms;

public class Program8 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Sai Venkata Krishna Sandeep");
        System.out.println(s1.substring(11));// op--" Krishna Sandeep"
        System.out.println(s1.substring(3, s1.length()));// op--" Venkata Krishna Sandeep"

        System.out.println("\n\n Subsequence \n");
        System.out.println(s1.subSequence(11, s1.length()));// Krishna Sandeep

        System.out.println("\n\n\t\t\tTrim \n");
        StringBuffer s2 = new StringBuffer(" Sai Venkata Krishna Sandeep ");
        // System.out.println(s1.trimToSize());
        s2.trimToSize();
        System.out.println(s1);
        

    }

}
