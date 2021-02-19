import java.util.Scanner;

public class ArraySumandProductFunction 
{
    public static void Equal(int arr[],int arr1[])
    {
        int sum=0,product=1;
        for(int i=0;i<arr.length;i++)
        {
            
            sum=arr[i]+arr1[i];//Elements of both arrays added
            product=arr[i]*arr1[i];//Elements of both arrays are multiplied

        }
        if(sum==product)//condition to check whether sum and product are equal 
        {
            System.out.println("Given arrays sum and product are equal");
        }
        else
        {
            System.out.println("Given arrays sum and product are not equal");
        }

    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int size;
       //input validation....
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNext())
            {
                System.out.println("Entered value is not valid.Please enter valid number");
                scan.next();
            }
           size =scan.nextInt();
        }while(size<=0); 
        int arr[] = new int[size];
        int arr1[]=new int[size];
        System.out.println("Enter 1st array elements");
        for(int i=0;i<size;i++)//for loop to enter elements of arr
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter 2nd array elements");
        for(int i=0;i<size;i++)//for loop to enter elements of arr1
        {
            arr1[i]=scan.nextInt();
        }
        Equal(arr, arr1);//calling the method
        scan.close();
    }
    
}
