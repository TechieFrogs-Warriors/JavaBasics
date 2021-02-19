class Counter
{
    int i;
   void increament()
    {
        for(i=0;i<=3;i++)
        {
            if(i==3)
            {
                System.out.println("i = "+i);
            }
        }

    }
}
class Encounter extends Counter
{
    void encounter()
    {
        increament();
    }

}
public class Inheritence7 
{
    public static void main(String[] args) 
    {
        Encounter Obj = new Encounter();
        Obj.encounter();
        
    }
    
}
