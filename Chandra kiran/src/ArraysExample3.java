public class ArraysExample3 
{
    static String[] Name()
    {
      return new String[] {"my","name","is","chandrakiran"};

    }
    public static void main(String[] args) 
    {
        String S[]=Name();
        for(int i=0;i<S.length;i++)
        {
            System.out.print(S[i]+" ");
        }
        
        
    }
    
}
