package ProgramizExamplePrograms;

import java.util.Arrays;

public class ConvertStringToCharArray {
    public static void main(String[] args) {

        String str = "Sai Sandeep";

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch + "  ");
        }

        System.out.println("\n" + Arrays.toString(ch));
    }
}
