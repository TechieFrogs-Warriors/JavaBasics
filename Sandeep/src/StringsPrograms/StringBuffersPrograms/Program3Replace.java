package StringsPrograms.StringBuffersPrograms;

public class Program3Replace {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("This is the java program languaage");
        System.out.println(s1.replace(8, 11, " an"));
        StringBuffer s2 = new StringBuffer("Sai");
        System.out.println(s2.replace(0, 3, "Sandeep"));
        // System.out.println(s2.replace(0, 1, 's'));//we cannot do it in char
        System.out.println(s2.replace(0, 1, "s"));
    }

}
