package Java8_Features;

import java.time.LocalDate;

public class CompareTwoDates {
    public static void main(String[] args) {
        
        //Taking one date
        LocalDate firstDate = LocalDate.of(2021, 02, 19);
        //Taking another date
        LocalDate secondDate = LocalDate.of(2021, 03, 19);

        //comparing two dates here
        //gives '1' if first date comes after second date
        //gives '-1' if first date comes before second date
        //gives '0' if both dates are equal
       int checkDifference = firstDate.compareTo(secondDate);
       //checking the result after comparision
       if(checkDifference == 0)
       {
           System.out.println("First date "+firstDate+" and second date "+secondDate+ " are equal");
       }
       else if(checkDifference < 0)
       {
            System.out.println("First date "+firstDate+" comes before second date "+secondDate);
       }
       else if(checkDifference > 0)
       {
           System.out.println("First date "+firstDate+" comes after second date "+secondDate);
       }
        
        //to check if firstdate is comming after second date
        System.out.println("first date comes after second date : "+firstDate.isAfter(secondDate));//returns true/false

        //to check if firstdate is comming before second date
        System.out.println("first date comes before second date : "+firstDate.isBefore(secondDate));//returns true/false

        //to check if both dates are equal
        System.out.println("first date and second date are equal : "+firstDate.isEqual(secondDate));//returns true/false
    }
    
}
