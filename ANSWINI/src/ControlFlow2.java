public class ControlFlow2 
{
    public static void main(String[] args)
     {
        String hair="black";char c='$';String name="answini";int age=30;float height=5.5f;
        String colour="fair";String character="good";int weight=30;
        if(name=="answini"&&age<=30)
        {
            if(((height==5.5||weight>=50))&&(colour=="fair" & hair=="black"))
            {
                System.out.println("You are answini");
            }else if(character=="good")
            {
                System.out.println("You are good human being");
            }else
            {
                System.out.println("You are an animal...");
                switch(c)
                {
                    case '#': System.out.println("you a lion");break;
                    case '$': System.out.println("you are a Tiger");break;
                    case '@': System.out.println("you are a parrot");
                    default : System.out.println("Since you are an animal you can't think like human");
                }
                
            }
        }else
        {
            System.out.println("You are not answini");
        }

    }
}
