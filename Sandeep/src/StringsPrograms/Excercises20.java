package StringsPrograms;

public class Excercises20 {
    public static void main(String[] args) {
        String s1 = "this is java programing language";

        System.out.println(s1.indexOf("programing"));// 13 true

        System.out.println(s1.indexOf("the"));// -1 false

        System.out.println(s1.indexOf("this", 0));// 0 true

    }

}
