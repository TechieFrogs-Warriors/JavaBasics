package StringsPrograms;

public class Excercises14 {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("Sai");
        s1.append(" Venkata Krishna Sandeep");
        System.out.println(s1 + "\t lendth is : " + s1.length());

        s1 = new StringBuffer();
        System.out.println(s1 + "\t Length is : " + s1.length());
    }

}
