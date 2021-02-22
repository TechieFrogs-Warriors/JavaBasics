import java.util.Calendar;

public class Numberofweekdays 
{
    public static void main(String[] args) 
    {
        
       Calendar Start =Calendar.getInstance();
       Start.set(2021, 01, 10);
       Calendar End = Calendar.getInstance();
       End.set(2021, 02, 10);
       int Days=0;
       int friday=Calendar.FRIDAY;
       while(Start.before(End))//checking before end date
       {
           if(Start.get(Calendar.DAY_OF_WEEK)==friday)//checks whether the day is friday
           {
               Days++;//if friday increaments days
               Start.add(Calendar.DATE, 7);//adds 7 to date

           }
           else
           {
               Start.add(Calendar.DATE, 1);//adds 1 to date
           }

       }
        System.out.println("No.of Fridays between two dates "+Days);
    }
    
    
}
