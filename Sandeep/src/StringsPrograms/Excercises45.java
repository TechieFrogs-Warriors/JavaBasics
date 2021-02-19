package StringsPrograms;

public class Excercises45 {
    public static void main(String[] args) {
        String s1 = "Sai";
        String s2 = "Sandeep";
        System.out.println("Values before swapping s1 : " + s1 + " s2 : " + s2);
        int i = s1.length();

        s1 = s1 + s2;
        s2 = s1.substring(0, i);
        s1 = s1.substring(i);
        System.out.println("Values After swapping s1 : " + s1 + " s2 : " + s2);

    }

}
