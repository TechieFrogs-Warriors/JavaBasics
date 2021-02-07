package Exception_Concept;

public class Program22 
{
    //program using multiple try and catch blocks
    public static void main(String[] args) 
    {
       try
        {

            int[] arr=new int[5];
            System.out.println("length of array is: "+arr.length);
            arr[5]=2;//throws exception
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
       try
       {
            int a=50,b=0;
            int c=a+b;
            System.out.println("sum of a nd b: "+c);
            c=a/b;//throws exception
       }
       catch(ArithmeticException e)
        {
           System.out.println(e);
        }
       
       try
        {
            String name="answini";//length is 7
            char ch=name.charAt(8);//throws exception
            System.out.println(ch);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("This is rest of code");

    }
    
}
