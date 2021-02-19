package Advanced_Programs;

public class Program2 
{
    //program to sort integer array without using sort() method
    public static void main(String[] args) 
    {
        //creating an array with elements
        int[] arr = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
       
        //sorting logic  
        System.out.println("Array elements after sorting:");  
        for (int i=0;i<arr.length;i++)   
        {  
            for (int j=i+1;j<arr.length;j++)   
            {  
                int temp = 0;  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
            //prints the sorted element of the array  
            System.out.print(arr[i]+" ");  
        }  
        
    }
    
}
