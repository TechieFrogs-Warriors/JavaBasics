package Accenturepgms;

import java.util.Calendar;

public class Ass6 {
    public static void main(String[] args) {
        Calendar startdate = Calendar.getInstance();//setting starting date
        startdate.set(2021,2,1);
        Calendar enddate=Calendar.getInstance();//stting ending date
        enddate.set(2021,2,28);
        int count=0;
        while(startdate.before(enddate)){  ///////iteratind upto enddate i.e 28
            if(startdate.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY){//////comparing each day with friday
                count ++;
                startdate.add(Calendar.DATE,7);/////here adding 7 days

            }
            else{
                startdate.add(Calendar.DATE,1);
            }
        }
        System.out.println("number of fridays :" +count);
    }
    
}
