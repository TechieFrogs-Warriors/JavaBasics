import java.util.Scanner;

public class PassingArgumentsToMethod 
{
    public static void display(int a,int b)
    {
        int c=a+b;
        System.out.println("sum is : "+c);
    }
    public static int multiply(int a,int b)
    {
        return a*b;
    }
    //printing array elements
    public static int[] arrMethod(int [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        return a;
    }
    //reversing array elements
    public static int[] revArrMethod(int [] a)
    {
        int[] revarr=new int[a.length];
        for(int i=0,j=revarr.length-1;i<a.length;i++,j--)
        {
            revarr[j]=a[i];
            
        }
        return revarr;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        display(num1, num2);//addition method
        System.out.println("multiply result is: "+ multiply(num1, num2));//multiplication method
        //declaring an array 
        System.out.println("Enter array size");
        int arr[]=new int[sc.nextInt()];
        //Taking array elements from user input
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("original array elemnts are: ");
        arrMethod(arr);
        System.out.println("\nReverse array elements are: ");
        arrMethod(revArrMethod(arr));
        
        sc.close();
        
        
    }

    
}
