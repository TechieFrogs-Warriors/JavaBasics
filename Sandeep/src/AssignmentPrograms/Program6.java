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

        while (start.before(end)) {// lopp iterates till the given end date
            if (start.get(Calendar.DAY_OF_WEEK) == friday) {// cheks for the friday
                numberofdays++;
                start.add(Calendar.DATE, 7);
            } else {
                start.add(Calendar.DATE, 5);
            }
        }
        System.out.println(numberofdays);

    }

}
