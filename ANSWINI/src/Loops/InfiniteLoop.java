public class InfiniteLoop {
    public static void main(String[] args)
    {
        String s="Answini";int a=10;
        while(s=="Answini"&&a>=10)//Here the condition will be always true according to input given
        {
            System.out.println(a);
            a++;

        }//Infinetely executes this loop
        
    }
    
}
