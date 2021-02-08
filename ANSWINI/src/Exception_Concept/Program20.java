package Exception_Concept;

public class Program20 
{
    //program for number format exception
    public static void main(String args[])
    {
       try
        {
            int num=Integer.parseInt ("aswini") ;//throws exception because string is passed for integer type
            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number format exception occurred");
        }
    }
    
}
