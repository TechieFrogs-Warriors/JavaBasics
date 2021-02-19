package StringsConcept;

public class Program8 
{
    public static void main(String[] args) 
    {
        String str= "aswini";//string input
        boolean numeric = true;//flag setting
        
        try 
        {
            //throws exception if input is not of double datatype
            double num = Double.parseDouble(str);
        } 
        catch (NumberFormatException e) 
        {
            numeric = false;//setting flag to false if exception occur
        }

        if(numeric)
            System.out.println(str + " is a number");
        else
            System.out.println(str + " is not a number");
    
    }
    
}
