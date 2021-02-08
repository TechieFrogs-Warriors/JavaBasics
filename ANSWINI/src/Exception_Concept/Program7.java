package Exception_Concept;

public class Program7 
{
    //program to explain chained exceptions(one exception describes about another exception)
    public static void main(String[] args) 
  { 
    try
    { 

      NumberFormatException a = new NumberFormatException("--->Displayed Exception"); 
      a.initCause(new NullPointerException("-----> Actual cause of the exception")); 
      throw a; 
    } 
    catch(NumberFormatException a) 
    { 
      System.out.println(a); 
      System.out.println(a.getCause()); 
    } 
  } 
    
}
