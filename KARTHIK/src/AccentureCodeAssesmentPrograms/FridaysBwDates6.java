package AccentureCodeAssesmentPrograms;

import java.util.*;

public class FridaysBwDates6 {
   public static void main(String[] args) {
       //set start date
       Calendar startDate = Calendar.getInstance();
       startDate.set(2020, 1, 1);

       //set end date
       Calendar endDate = Calendar.getInstance();
       endDate.set(2020, 1, 28);

       int count=0;

       while(startDate.before(endDate)){//iterates upto 28
           //compare each day with friday
           if(startDate.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY){
               count ++; 
               startDate.add(Calendar.DATE, 7);//add 7 days           
            }
            else{
                startDate.add(Calendar.DATE, 1);
            }
        }
        System.out.println("Number of Fridays:" +count);
   } 
}
