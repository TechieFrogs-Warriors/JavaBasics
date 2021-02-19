public class ConstructorSample 
{
    public static void main(String[] args) 
    {
        //creating object to main class here which invokes constructor also.
        ConstructorSample obj = new ConstructorSample();
        System.out.println("The name is " + obj.name);
        
    }
    String name;
    ConstructorSample() //This is a constructor so using same name as classname
    {
        System.out.println("Constructor Called:");
        name = "Answini";
    }
    
}

