package Advanced_Programs;
import java.util.*;

//two sum array program
public class Program1 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) 
        {
            if(nums[left] + nums[right] == target) 
            {
                return new int[] {nums[left], nums[right]};
            } 
            else if(nums[left] + nums[right] < target) 
            {
                left++;
            } 
            else 
            {
                right--;
            }
        }
        return nums;
    }
    public static void main(String[] args) 
    {
        //Reading input from user for array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Array size");
        int[] nums=new int[sc.nextInt()];
        for(int i=0;i<nums.length;i++)
        {
            System.out.print("Enter Array Elements:");
            nums[i]=sc.nextInt();
        }
        //Reading target from user
        System.out.println("Enter target sum to be achieved");
        int target=sc.nextInt();

        //calling twosum method
        System.out.println("The pair of Array elements formed the target are: "+Arrays.toString(twoSum(nums, target)));

        sc.close();

    }
        
}
