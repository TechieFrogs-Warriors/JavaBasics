package ExceptionPrograms.Excercises;

import java.io.*;

public class Excercises9 {
    public static void main(String[] args) throws IOException {
        try {
            File obj = new File("C:/Users/hp/OneDrive/Documents/New folder");
            FileReader fr = new FileReader("Sucessfull");
            System.out.println(fr);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
