package Interface_Concept;

public class Program8 
{
    public static void main(String[] args) 
    {
        Return_Inter ret=new Return_Inter();
        IName i=ret.getIName();
        i.display_Movie();
    }
    
}
class Return_Inter
{
    public IName getIName()
    {
        IName i = new IName() 
        {

            @Override
            public void display_Movie() 
            {
                System.out.println("The interface displayMovie method is implemented in inner class of dispalyAll method");
            }
            
        };
        return i;
    }

}
//interface
interface  IName
{
    public void display_Movie();
        
}
