package Wipro_AdvancedPrograms2;

import java.util.Scanner;

//To find smallest positive number from an array of elements
public class SmallestPositiveNumber 
{
   public static void main(String[] args) 
    {
        //Reading input from user
        Scanner sc = new Scanner(System.in);

        //take an array
        System.out.println("Enter the size of the array");
        int[] inpArray = new int[sc.nextInt()];

        //Enter elements into array
        for(int i=0;i<inpArray.length;i++)
        {
            inpArray[i] = sc.nextInt();
        }
        //calling method that perform logic to find positive missing number
        System.out.println("Missing positive number is: "+missingNumber(inpArray));
        
        sc.close();
       
    } 
    //Logic method that finds positive missing number
    public static int missingNumber(int[] inpArray) 
    {
        //length of input array
        int len = inpArray.length;
 
    	for (int i=0;i<len;i++) 
        {
            //when the i'th element is not i
    		while (inpArray[i] != i + 1) 
            {
                //no need to swap when ith element is out of range [0,len](below 0 and above length of array)
    			if (inpArray[i] <= 0 || inpArray[i] >= len)
                {
                    break;
                }
                //checking for duplicate elements 
                if(inpArray[i]==inpArray[inpArray[i]-1])
                {
                    break;
                }	
                //swapping the elements	
    			int temp = inpArray[i];
    			inpArray[i] = inpArray[temp - 1];
    			inpArray[temp - 1] = temp;
    		}
    	}
        //printing loop
    	for (int i=0;i<len;i++)
        {
    		if (inpArray[i] != (i + 1))
            {
    			return (i + 1);
    		}
    	}	
    	return (len + 1);
    }
}
