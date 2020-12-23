public class DoWhileContinue {
    public static void main(String[] args)
    {
        String s="Answini";int a=1;
        do{
            if(a==1)
            {
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }
        while(s=="Answini"&&a<=9);
        
    } 
    
}
