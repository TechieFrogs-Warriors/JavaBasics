package Java_Interview_programs;
//Find the missing element from the array
public class MissingElement_InArray 
{
    public static int missingNumber(int[] arr)
    {
        //Finding length of the array and adding 1 to it
        int n = arr.length+1;
        //Finding sum of 'n' numbers using (n*(n+1))/2 formula
        int sumOf_N_Numbers = n*(n+1)/2;
        //Assuming initial sum of array elements as zero
        int arrayElementSum = 0;
        //Finding the array elements sum
        for (int i=0;i<arr.length;i++) 
        {
            arrayElementSum += arr[i];
        }
        //To get the missing number subtract 
        int missingNumber = sumOf_N_Numbers - arrayElementSum;
        return missingNumber;
    }
    public static void main(String[] args) 
    {
        //Initializing an array
        int[] arr = {2,4,3,5,7,6};
        //Passing array to the logic method and displaying result
        System.out.println("Missing number from the array is: "+missingNumber(arr));

        
    }
    
}
