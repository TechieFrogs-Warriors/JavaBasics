import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringsPrg3 {
    public static void main(String[] args) throws ParseException
    {
        String Date ="29/01/2021";
        SimpleDateFormat S = new SimpleDateFormat("dd/MM/yyyy");
        Date date = S.parse(Date);
        System.out.println(Date+"\t"+date);
    }
    
}
