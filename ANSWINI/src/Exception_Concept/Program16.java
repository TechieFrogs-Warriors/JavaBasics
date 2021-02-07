package Exception_Concept;

public class Program16 //implements Cloneable
{
    //program for clone not supported exception
    public static void main(String[] args) 
    {
        try
        {
            Program16 p=new Program16();
            p.clone();//throws exception because this class not implementing "cloneable" interface
            //System.out.println("no exception occured");
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("clone not supported exception occured");
        }
        
    }
    
}

