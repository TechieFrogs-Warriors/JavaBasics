
//Program to find the indices of the array which gives result 23,where arr={1,2,3,5,9,14}
public class IndicesofResult 
{
    public static void main(String[] args) 
    {
        //Take an integer array with values
        int[] arr = {1,2,23,5,9,14}; 
        int result = 23;// indices that form 23 as per question
        int temp = 0;//temporery variable initialized to 0.

        //Logic loop to check the indices that are forming 23
        for(int i=0;i<arr.length;i++)
        {
            //condition to check if the contril reached the last index of array..
            if(i==arr.length-1 && result != temp)
            {
                //if reached last index..then no match found
                System.out.println("No matching found");
            }
            //assining index position value to temp to check whether result matches that index value itself
            temp = arr[i];
            //inner loop to add with the next elements and to check whether they form the result
            for(int j=i+1;j<arr.length;j++)
            {
                //if that index place value matches the result then print that index and break
                if(result==temp)
                {
                    System.out.println("the indices that form 23 are: " + i);
                    break;
                }
                //if that index place value dont match then start adding with the next elements 
                //and if matches the result then print that indices and break
                else if(result!=temp)
                {
                    temp = arr[i] + arr[j];
                    if(result==temp)
                    {
                        System.out.println("the indices that form 23 are: " + i+","+j);
                        break;
                    }
                
                }
                
                
            }
            
        }
    }
    
}
