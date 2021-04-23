public class DoWhileBreak {
    public static void main(String[] args)
    {
        String s="Answini";int a=1;
        do{
            if(a==4)
            {
                System.out.println(a);
                a++;
                break;
            }
            System.out.println(a);
            a++;
        }
        while(s=="Answini"&&a<=8);
        
    } 
}
