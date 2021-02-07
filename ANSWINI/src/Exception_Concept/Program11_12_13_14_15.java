package Exception_Concept;

import java.util.Scanner;

public class Program11_12_13_14_15 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        System.out.println(".........................................");
        try 
        {
            c=a/b;//throws exception if b=0
            System.out.println("Division result is:"+c);
        }
        catch(ArithmeticException e) 
        {
            System.out.println("Arithmetic exception..divide by '0'");
        }
        System.out.println(".........................................");
        try 
        {
            System.out.println("ArrayoutofBoundsException code");
            int[] arr=new int[5];
            arr[5]=2;//throws exception
        
        }
        catch(ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array out of bound exception..occured");
        }
        System.out.println(".........................................");
        //string out of bound exception
        try 
        {
            
            System.out.println("StringoutofboundException code");
            String name="answini";//length is 7
            char ch=name.charAt(8);//throws exception
            System.out.println(ch);
        
        }
        catch(StringIndexOutOfBoundsException e) 
        {
            System.out.println("String out of bound exception..occured");
        }
        System.out.println(".........................................");
        try 
        {
            
            System.out.println("Nullpinter Exception code");
            String name=null;
            char ch=name.charAt(8);//throws exception
            System.out.println(ch);
        
        }
        catch(NullPointerException e) 
        {
            System.out.println("Null pointer exception..");
        }
        System.out.println(".........................................");
        try 
        {
            System.out.println("Index out of bound exception code");
            int[] arr={1,2,3};
            for(int i=0;i<=arr.length;i++)//throws exception
            {
                System.out.println(arr[i]);
            }
        }
        catch(IndexOutOfBoundsException e) 
        {
            System.out.println("Index out of bound exception..occured");
        }
        System.out.println(".........................................");
        try 
        {
            System.out.println("Negative Array size Exception code");
            int[] arr=new int[-5];//throws exception
            System.out.println(arr.length);
        
        }
        catch(NegativeArraySizeException e) 
        {
            System.out.println("Negative Array size exception..occured");
        }
        System.out.println(".........................................");
        //class not found exception
        try 
        {
            System.out.println("class not found exception code");
            Class.forName("Program");//throws exception
            System.out.println("program class successfully loaded");
        
        }
        catch(ClassNotFoundException e) 
        {
            System.out.println("class not found exception..occured");
        }
            
            sc.close();
        
    }
    
}
