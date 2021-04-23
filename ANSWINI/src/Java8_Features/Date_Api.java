package Java8_Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_Api {
    public static void main(String[] args) {

        //LocalDate class(predefined and have private constructor so cant create object using 'new'..so we use now())
        LocalDate ld = LocalDate.now();
        System.out.println(ld);//gives today date
        System.out.println(ld.getYear());//this year
        System.out.println(ld.getMonth());//this month number
        System.out.println(ld.getMonthValue());//this month name
        System.out.println(ld.getDayOfWeek());//this day name
        System.out.println(ld.getDayOfMonth());//this day number
        System.out.println(ld.plusDays(2));//adding +2days to current date
        System.out.println(ld.minusDays(2));//subtracting -2days from current date


        //LocalTime class(predefined and have private constructor so cant create object using 'new'..so we use now())
        LocalTime lt = LocalTime.now();//gives current time
        System.out.println(lt.getHour());//gives current hour
        System.out.println(lt.getMinute());//gives current minutes
        System.out.println(lt.getSecond());//gives current seconds
        System.out.println(lt.getNano());//gives current nanoseconds


        //LocaDateTime class(predefined and have private constructor so cant create object using 'new'..so we use now())
        LocalDateTime ldt = LocalDateTime.now();//gives current date and time also

        //converting string to date using DateTimeFormatter class
        String s ="Jun 04 1987";//string format date is taken as input
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mmm dd yyyy");//here exactly same format as string should be followed
        LocalDate ld2 = LocalDate.parse(s, dtf);//converting string to localdate format
        System.out.println(ld2);//prints string in localdate format

        //converting date to string using DateTimeFormatter class
        LocalDate ld3 = LocalDate.now();//localdate format is taken as input
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("mmm dd yyyy");//here exactly same format as string should be followed
        String strformat = ld3.format(dtf2);//converting localdate to string format
        System.out.println(strformat);//prints localdate in string format
    
        
    }
    
}
