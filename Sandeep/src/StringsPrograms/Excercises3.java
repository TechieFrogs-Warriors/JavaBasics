package StringsPrograms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Excercises3 {
    public static void main(String[] args) {

        String s1 = "2020-08-12";// year-month-date
        LocalDate obj = LocalDate.parse(s1, DateTimeFormatter.ISO_DATE);
        System.out.println(obj);

    }

}
