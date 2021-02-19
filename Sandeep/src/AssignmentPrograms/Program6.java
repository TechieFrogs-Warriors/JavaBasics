package AssignmentPrograms;

import java.util.*;

public class Program6 {
    public static void main(String[] args) {

        Calendar start = Calendar.getInstance();// creating a object to calender class in util package
        start.set(2018, 8, 12);

        Calendar end = Calendar.getInstance();// creating a object to calender class in util package
        end.set(2019, 9, 13);

        System.out.println("Number of fridays betwwen " + start.getTime() + " and " + end.getTime() + " is :: ");
        int numberofdays = 0;
        int friday = Calendar.FRIDAY;

        while (start.before(end)) {// lopp iterates from start date to end date
            if (start.get(Calendar.DAY_OF_WEEK) == friday) {// cheks for the friday
                numberofdays++;// counts thr n0 of days
                start.add(Calendar.DATE, 7);// afeter every count the date is changes to next 8th day i.e friday
            } else {// if not friday this condtion is excuted
                start.add(Calendar.DATE, 5);
            }
        }
        System.out.println(numberofdays);

    }

}
