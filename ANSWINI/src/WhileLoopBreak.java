public class WhileLoopBreak {
    public static void main(String[] args)
    {
        String s="Answini";int a=1;
        while(s=="Answini"&&a<=8)
        {
            if(a==4)
            {
                System.out.println(a);
                a++;
                break;
            }
            System.out.println(a);
            a++;
            
        }
    }
    
}
