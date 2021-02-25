import java.util.Scanner;

public class Sorting 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int size;
        //input validation..
        do
        {
            System.out.println("Enter the valid number");
            while(!scan.hasNext())
            {
                System.out.println("Entered number  is not valid .Please enter valid number");
                scan.next();
            }
            size=scan.nextInt();
        }while(size<=0);
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)//for loop for taking array elements
        {
            arr[i]=scan.nextInt();
        }
        sort(arr);
        scan.close();
        
        
    }
    public static void sort(int arr[])
    {
        int temp;
        System.out.println("Sorted array is ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])//checks the first element is greater or less than next elements
                {
                    temp=arr[j];//less element is place in temperory varaible
                    arr[j]=arr[i];//a[i] value is place in a[j]
                    arr[i]=temp;
                
                }
            }

            System.out.print(arr[i]+" ");
            
        }
        
    }
    
}
// 2.	Program to Sort an Integer Array with out using sort()
// int [] my_array1 = {
//             1789, 2035, 1899, 1456, 2013, 
//             1458, 2458, 1254, 1472, 2365, 
//             1456, 2165, 1457, 2456};
