package Java_Interview_programs;
//program to find largest and smallest element from the array
public class LargestAndSmallest_InArray 
{
    public static void main(String[] args) 
    {
        //Initializing an array
        int[] arr = {2,4,3,5,7,6};
        //Assuming the largest and smallest number as the first number in the array
        int maxNumber = arr[0];
        int minNumber = arr[0];
        //Logic loop to compare the first element  with remaining elements in the array
        for(int i=1;i<arr.length;i++)
        {
            //if first element is smaller than compared element then it remains same
            // otherwise minNumber is updated with the smallest between the two numbers and so on
            if(arr[i] < minNumber)
            {
                minNumber= arr[i];

            }
            //if first element is greater than compared element then it remains same
            // otherwise maxNumber is updated with the largest between the two numbers and so on
            else if(arr[i] > maxNumber)
            {
                maxNumber = arr[i];
            }
        }
        //printing the final smallest and largest element found at the end of the loop
        System.out.println("Largest number is: "+maxNumber);
        System.out.println("Smallest number is: "+minNumber);
    }
}
