public class ExceptionPrg17 
{
    public static void main(String[] args) 
    {
        boolean D=false;
        Test(D);
    }
    static void Test(boolean D)
    {
     boolean C=false;
     try
     {
         throw new InstantiationException("Instantiation Exception occurs");
     }
     catch(InstantiationException e)
     {
         C=true;
         System.out.println(e);

     }  
     System.out.println(C);  
    }
    
}
