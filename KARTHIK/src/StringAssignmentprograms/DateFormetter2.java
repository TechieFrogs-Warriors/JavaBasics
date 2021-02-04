package StringAssignmentprograms;
//Java Program to Convert String to Date
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateFormetter2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("formate should be like this year-month-day");
        System.out.println("Enter Date: ");
        String Str1=scan.nextLine();
        
        LocalDate date = LocalDate.parse(Str1, DateTimeFormatter.ISO_DATE);

        System.out.println("String to Date: "+date);
        scan.close();
    }
    
}
