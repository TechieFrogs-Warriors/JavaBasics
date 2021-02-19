package TypeCating_Concept;

public class DownCasting_Practice 
{
    public static void main(String[] args) 
    {
        //placing subclass memory into subclass reference using castoperator by pointing towards superclass reference
        Mobile m=new Redmi();//First upcasting is done here
        Redmi red=(Redmi)m;//Now Downcasting is done here
        red.calling();//superclass can be called now
        red.messaging();//superclass can be called now
        red.battery();//subclass method can called now
        red.sound();//subclass method can called now
        System.out.println(m.name);//superclass variable is called here 
        
        
    }
    
}
//subclass (of mobile class from upcasting.java file)
class Redmi extends Mobile
{
    //value=200;
    //name="achyuth";
    void sound()
    {
        System.out.println("Iam sound method of Redmi class ");
    }
    void battery()
    {
        System.out.println("Iam battery method of Redmi class");
    }
   
}
