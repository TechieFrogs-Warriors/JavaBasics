import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeCastingExample3 {
    public static void main(String[] args) throws ParseException 
    {
        String S="11/02/2021";
        SimpleDateFormat S1=new SimpleDateFormat("dd/MM/yyyy");
         Date date=S1.parse(S);
         System.out.println("String to date "+date);
         S=DateFormat.getDateInstance().format(date);
         System.out.println("date to String "+S);
         String S2="26/12/2022";
         Date date1 =S1.parse(S2);
         System.out.println("String to Date "+date1);
         String S3="chandrakiran";
         char ch=S3.charAt(0);
         System.out.println("String to char "+ch);
         S3=Character.toString(ch);
         System.out.println("Char to String "+S3);
    
     }
    
}
