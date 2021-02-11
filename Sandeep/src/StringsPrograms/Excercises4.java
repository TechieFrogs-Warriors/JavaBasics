package StringsPrograms;

import java.io.*;

public class Excercises4 {
    public static void main(String[] args) {

        try {
            int division = 0 / 0;
        } catch (ArithmeticException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            System.out.println(exceptionAsString);
        }
    }

}
