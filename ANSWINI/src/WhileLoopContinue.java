public class WhileLoopContinue {
    public static void main(String[] args)
    {
        String s="Answini";int a=1;
        ABC://ABC is Label
        while(s=="Answini"&&a<=8)
        {
            if(a==4)//Doesn't print only when condition is true ,afterthat continues the iteration for the rest
            {
                
        
                a++;
                continue ABC;
            }
            System.out.println(a);
            a++;
            
        }
    }
    
}
