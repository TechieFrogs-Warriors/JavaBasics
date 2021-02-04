package StringsPrograms.StringBuffersPrograms;

public class Program7 {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("Iam Sai Sandeep");
        System.out.println(s1.codePointAt(2));// ascii valoe 109
        System.out.println(s1.codePointBefore(2));// ascii valoe 97
        System.out.println(s1.codePointCount(1, 3));// give count of values
        System.out.println(s1.hashCode());// it gives the hash code value
        System.out.println(s1.offsetByCodePoints(3, 9));// 12

        System.out.println("\n\n Index values \n");
        System.out.println(s1.indexOf("Sai"));// index value 4
        System.out.println(s1.indexOf("Sandeep", 0));// 8
        System.out.println(s1.lastIndexOf("a"));// 9
        System.out.println(s1.lastIndexOf("a", 7));// 5
    }

}
