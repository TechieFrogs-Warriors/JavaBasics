package StringsConcept;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program3 
{
    public static void main(String[] args) throws Exception 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a date");
        String d = sc.nextLine();  
        Date D=new SimpleDateFormat("dd/MM/yyyy").parse(d);  
        System.out.println(d+"\t"+D);
        sc.close();

    }
    
}
