package Java_Interview_programs;
//Given a sorted array and a number x, find the pair in array whose sum is closest to x
public class PairSumCloseTo_X_InArray 
{
    public static void findPairWithClosestToX(int arr[],int X)
    {
        if(arr.length<2)
            return;
        // Suppose 1st two element has minimum diff with X
        int minimumDiff=Math.abs(arr[0]+arr[1]-X);
        int pair1stIndex=0;
        int pair2ndIndex=1;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i+1; j < arr.length; j++) 
            {
                int tempDiff=Math.abs(arr[i]+arr[j]-X);
    
                if(tempDiff< minimumDiff)
                {
                    pair1stIndex=i;
                    pair2ndIndex=j;
                    minimumDiff=tempDiff;
                }
            }
        }
        System.out.println(" The pair whose sum is closest to  "+X+ " using brute force method: "+arr[pair1stIndex]+","+ arr[pair2ndIndex]);
    }

    public static void main(String[] args) 
    {
        //Initializing array
        int[] arr = {5,2,8,4,5};
        int x = 15;//as per question take any value for 'x'
        //passing array to logic method
        PairSumCloseTo_X_InArray.findPairWithClosestToX(arr,x);

    }
}
