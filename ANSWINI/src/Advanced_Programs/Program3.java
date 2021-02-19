package Advanced_Programs;

public class Program3 
{
    //program to sort string array without using sort() method
    public static void main(String[] args) 
    {
        //creating an array with elements
        String[] arr = {"aswini","vivek","achyuth","bharat","vedansh","prasad","lakshmi"};
       
        //sorting logic  
        System.out.println("Array elements after sorting:");  
        for (int i=0;i<arr.length;i++)   
        {  
            for (int j=i+1;j<arr.length;j++)   
            {  
                if (arr[i].compareTo(arr[j])>0 )   
                {  
                    String temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
            //prints the sorted element of the array  
            System.out.print(arr[i]+" ");  
        }  
        
    }
    
}
