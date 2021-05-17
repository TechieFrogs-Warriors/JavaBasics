package Java_Interview_programs;
//Find peak element in the array.
public class LeadersInTheArray 
{
    public static void main(String[] args) 
    {
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        //First Logic method
        findLeadersInAnArrayBruteForce(arr);
        System.out.println("\n==================");
        //Second Logic method
        findLeadersInAnArray(arr);
    }
    
    //First logic method
    public static void findLeadersInAnArrayBruteForce(int arr[])
    {
        System.out.println("Finding leaders in an array using brute force : ");
        for (int i = 0; i < arr.length; i++) 
        {
            boolean isLeader=true;
            for (int j = i+1; j < arr.length; j++) 
            {
                if(arr[i] <= arr[j])
                { 
                    isLeader=false;
                    break;
                }    
            }
            if(isLeader)
            System.out.print(arr[i]+" ");
        }
    }
    
    //Second Logic Method
    public static void findLeadersInAnArray(int arr[])
    {
        System.out.println("Finding leaders in an array : ");
        int rightMax=arr[arr.length-1];
        // Rightmost will always be a leader
        System.out.print(rightMax+" ");
        for (int i = arr.length-2; i>=0; i--) 
        {
            if(arr[i] > rightMax)
            {
                rightMax=arr[i];
                System.out.print(" "+rightMax);
            }
        }
    }

}
