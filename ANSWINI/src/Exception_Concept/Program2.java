package Exception_Concept;

public class Program2 
{
    //program to catch multiple exception types
    public static void main(String[] args) 
    {
        try
        {
            System.out.println(" catching Different types of exceptions in one catch block");

            System.out.println("ArrayoutofBoundsException code");
            int[] arr=new int[5];
            arr[5]=2;//throws exception

            System.out.println("ArithmaticException code");
            int a=50,b=0;
            int c=a/b;//throws exception
            System.out.println(c);

            System.out.println("StringoutofboundException code");
            String name="answini";//length is 7
            char ch=name.charAt(8);//throws exception
            System.out.println(ch);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
