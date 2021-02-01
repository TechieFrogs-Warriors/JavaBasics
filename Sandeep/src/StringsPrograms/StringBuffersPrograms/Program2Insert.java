package StringsPrograms.StringBuffersPrograms;

public class Program2Insert {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Sai");
        System.out.println(s1.insert(3, " venkata"));// Sai venkata
        System.out.println(s1.insert(11, " Krishna"));// Sai venkata Krishna
        System.out.println(s1.insert(19, false));// it prints the boolen values
        System.out.println(s1.insert(24, 'M'));// Sai venkata KrishnafalseM
        System.out.println(s1.insert(0, 'M'));// MSai venkata KrishnafalseM
    }

}
