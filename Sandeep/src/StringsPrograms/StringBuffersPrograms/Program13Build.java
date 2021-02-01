package StringsPrograms.StringBuffersPrograms;

public class Program13Build {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("This is the java program languaage");
        System.out.println(s1.replace(8, 11, " an"));
        StringBuilder s2 = new StringBuilder("Sai");
        System.out.println(s2.replace(0, 3, "Sandeep"));
        // System.out.println(s2.replace(0, 1, 's'));//we cannot do it in char
        System.out.println(s2.replace(0, 1, "s"));
    }

}
