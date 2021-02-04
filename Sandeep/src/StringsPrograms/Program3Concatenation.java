package StringsPrograms;

public class Program3Concatenation {
    public static void main(String[] args) {
        String s1 = "sai";
        s1.concat(" Sandeep " + "sdc");
        System.out.println(s1);// here we cannot chage the value of a string so it prints only sai

        String s3 = "Sri";
        String s4 = s3.concat(" Hari ");
        System.out.println(s4);// here we are assigning the value to the new object so it prints

        String s5 = "Sai";
        String s6 = " Venkata";
        String s7 = new String(" Krishna");
        String s8 = new String(" Sandeep");

        String s9 = s5 + s6.concat(s7 + s8);

        System.out.println(s9);

        System.out.println(s5 + s6 + s7 + s8);
    }

}
