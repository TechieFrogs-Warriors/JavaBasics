package StringsPrograms;

public class Program4Comparison {
    public static void main(String[] args) {
        String s1 = "Sai";
        String s2 = new String("Sai");
        String s3 = "sai";
        String s4 = new String("Sandeep");
        String s5 = new String("SAI");
        String s6 = new String("SANdeeP");
        String s7 = "Sand";
        String s8 = "eep";
        String s9 = "Sai";
        String s10 = "Sandeep";
        String s11 = new String("Sandeep");
        String s12 = new String("Sai");

        System.out.println(s2.equals(s12));// true
        System.out.println(s1.equals(s3));// false
        System.out.println(s1.equals(s5));// false
        System.out.println(s1.equalsIgnoreCase(s5));// true
        System.out.println(s1.equals(s4));// false
        System.out.println(s4.equals(s6));// false
        System.out.println(s4.equalsIgnoreCase(s6));// true
        System.out.println(s4.equalsIgnoreCase(s6 + s4));// false
        System.out.println(s4.equals(s7.concat(s8)));// true

        System.out.println("\nComparision by == oerator\n");
        System.out.println(s1 == s2);// false s2 is refred to a instance
        System.out.println(s1 == s9);// true
        System.out.println(s4 == s7.concat(s8));// false
        System.out.println(s4 == s11);// false s4 and s11 is referedto a instance
        String st1 = "Venkat";
        String st2 = "Venkat";
        System.out.println(st1 == st2);// true

        System.out.println("\n\n String Comparison using comparision method\n");
        System.out.println(s1.compareTo(s2));// 0 true
        String a1 = new String("Sai");
        String a2 = "Sandeep";
        String a3 = "sai";
        System.out.println(a1.compareTo(a3));// -32 there is a Case difference
        System.out.println(a1.compareToIgnoreCase(a3));// 0 there is a Case difference bou used ingnorence
        System.out.println(a2.compareToIgnoreCase(s7.concat(s8)));// 0
        System.out.println(a2.compareTo(a1));// 5
        System.out.println((a1 + s1).compareTo(a2 + s10));// -5
    }

}
