package Exception_Concept;

public class Practice 
{
    //try catch blocks can be written in a method only..not anywhere

    /* 
    try
        {
            int[] arr={1,2,3,};
            System.out.println(arr[5]);//may throw exception
        }
        //catch block
        catch(ArrayIndexOutOfBoundsException e)//generated type exception
        {
            System.out.println("iam in catch block");
        }
     */
    public static void main(String[] args) 
    {
        System.out.println("...............without catch or finnaly block.............................");
        //try block should have either catch or finally block
        /* int a=10,b=0,c;
        try
        {
            c=a/b;
        }
        System.out.println("practicing exception"); */
        System.out.println(".................with catch block...........................");
        int a=10,b=0,c;
        //try block
        try
        {
            c=a/b;
        }
        //catch block
        catch(Exception e)//parentclass exception
        {
            System.out.println(e);
        }
        System.out.println("practicing exception");//rest of the code

        System.out.println("................with finally block............................");
        int a1=10,b1=0,c1;
        //try block
        try
        {
            c1=a1/b1;
        }

        //if i dont use catchblock to handle exception total program terminates
       /*  catch(Exception e)
        {
            System.out.println(e);
        } */
        //finally block
        finally
        {
            System.out.println("iam in finally block");
        }
        System.out.println("practicing exception");//rest of the code


        System.out.println("................with catch and finally block............................");
        int a2=10,b2=0,c2;
        //try block
        try
        {
            c2=a2/b2;
        }
        //catch block
        catch(Exception e)
        {
            c2=a2/(b2+2);//we can correct if any exception in catch block occur from try block 
        }
        finally
        {
            System.out.println("iam in finally block");
        }
        System.out.println("practicing exception");//rest of the code

        System.out.println("................with multiple catch and finally block............................");
        int a3=10,b3=0,c3;
        String s=null;
        //try block
        try
        {
            c3=a3/b3;
            int len=s.length();
            System.out.println("length of string is "+len);

        }
        //catch block 1
        catch(ArithmeticException x)//generated type exception (should be before parent class exception)
        {
            System.out.println(x);
            c2=a3/(b3+2);//resolving exception occured in try block
        }
        //catch block 2
        catch(Exception e)//parent class exception
        {
            s="hello" ;//we can correct if any exception in catch block occur from try block
            System.out.println(e); 
        }
        /* catch(Exception e)//error occurs catch block cannot be reached
        {

        } */
        try
        {
            int len=s.length();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("iam in finally block");
        }
        /* finally
        {
            //there can one and only one finally block for every try block.throws error
        } */
        System.out.println("practicing exception");//rest of the code

        System.out.println("................with generated type exception............................");
        String s1="Iam aswini";
        //try block
        try
        {
            int[] arr={1,2,3,};
            System.out.println(arr[5]);//may throw exception

        }
        //catch block
        catch(ArrayIndexOutOfBoundsException e)//generated type exception
        {
            System.out.println("iam in catch block");
        }
        System.out.println(s1);//rest of the code


        System.out.println("................catch block dont hold exception code............................");
        String s2="Iam learning java";
        //try block
        try
        {
            int[] arr={1,2,3,};
            System.out.println(arr[5]);//may throw exception

        }
        //catch block
        catch(ArrayIndexOutOfBoundsException e)//generated type exception
        {
            int[] arr={1,2,3,};
            System.out.println(arr[5]);//may throw exception.here handling should be done,not exception code

        }
        System.out.println(s2);//rest of the code


        System.out.println("................Dont write rest of code in try block............................");
        String s3="Iam learning java";
        //try block
        try
        {
            int[] arr={1,2,3,};
            System.out.println(arr[5]);//may throw exception
            System.out.println(s2);//rest of the code.It wont get executed if any exception occurs before this.
        }
        //catch block
        catch(ArrayIndexOutOfBoundsException e)//generated type exception
        {
            System.out.println("iam in catch block");
        }
        
        
    }
    
}
