import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ExceptionPrg9 
{
    public static void main(String[] args) 
    {
        
        try 
        {
            FileInputStream f = new FileInputStream("file.txt");
        } 
        catch (FileNotFoundException e) 
        {
        
            System.out.println("file not exist");
        }
    
        
    }
    
}
