public class Stringprogram {
    public static void main(String[] args) {

        String s1 = "sai";
        String s2 = "sandeep";
        String s3 = "krishna";
        String s4 = "venkat";

        System.out.println(s1 + " " + s4 + " " + s3 + " " + s2);

        System.out.println("----- Lent of a string -----");
        System.out.println();
        String str = "Sai sandeep";
        System.out.println("String is : " + str);

        int length = str.length();
        System.out.println("length is:" + length);

        System.out.println("------ Sub string ------");
        System.out.println();
        String name = "Sai Venkata Krishna Sandeep";

        System.out.println(name.substring(4, 11));
        System.out.println(name.substring(0, 3));
        System.out.println(name.substring(12, 19));
        System.out.println(name.substring(20));
        System.out.println();
        System.out.println(name.substring(0, name.length() - 8));
    }
}
