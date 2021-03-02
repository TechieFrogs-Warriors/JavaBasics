package Practice;

import java.util.*;//import statemnt  for the calender class

public class Assesmnet1 {
    public static void main(String[] args) {
        Calendar start = Calendar.getInstance();// create a object for the start date
        start.set(2021, 2, 1);// starting date

        Calendar end = Calendar.getInstance();// creating an object for the end date
        end.set(2021, 2, 28);// end date

        int numberOfDays = 0;// intizing the varaibble to cont the number of days

        int friday = Calendar.FRIDAY;// intilizing the firday value

        // code for the fnding the number of fridays are ther betwwen the two dates

        while (start.before(end))// loop iterates from the satrt date to the end date
        {
            if (start.get(Calendar.DAY_OF_WEEK) == friday)// this condition is used to check for the ist friday froam
                                                          // the start date
            {
                numberOfDays++;// if friday counter is incremented

                start.add(Calendar.DATE, 7);// adding 7 to the first firday date
            } else {
                start.add(Calendar.DATE, 4);// if not firday it can be any day so simple we are adding the some day
            }
        }
        System.out.println("Number of fridays are :: " + numberOfDays);

    }

}
