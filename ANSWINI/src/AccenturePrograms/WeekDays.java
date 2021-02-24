package AccenturePrograms;

import java.util.Calendar;

//program to find fridays(Anyday of requirement) between two dates
public class WeekDays 
{
    //private static final Calendar Calender = null;

    public static void main(String[] args) 
    {
        //start date
        Calendar startDate = Calendar.getInstance();
        startDate.set(2021, 02, 04);
         //End date
        Calendar endDate = Calendar.getInstance();
        endDate.set(2021, 02, 16);
        //Logic
        int count=0;
        while(startDate.before(endDate))
        {
            if(startDate.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY)// can write anyday in place of friday
            {
                count++;//count if that day has come
                startDate.add(Calendar.DATE, 7);// checking every 7th day from starting date
            }
            //until you find the first occurence of the day(any day as per requirement)
            else
            {
                startDate.add(Calendar.DATE, 1);
            }
        }
        System.out.println("Number of fridays between the two dates are: "+count);

    }
}
