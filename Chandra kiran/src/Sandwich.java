interface FastFood
{
    void temperory();
}
public class Sandwich implements FastFood
{
   public void temperory()
    {
        System.out.println("Temperory Method");
    }
    public static void main(String[] args) 
    {
        Sandwich obj = new Sandwich();
        obj.temperory();
        
    }

    
    
}
