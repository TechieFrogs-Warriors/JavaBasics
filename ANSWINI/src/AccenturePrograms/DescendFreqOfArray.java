package AccenturePrograms;

import java.util.Arrays;

public class DescendFreqOfArray 
{
    public static int row = 0;
 
    public static void main(String[] args) 
    {
        //input array with elemnets
        int arr[] = {2, 5, 6, 2, 3, 5, 5};
        //array that holds element and its frequency value
        int newArr[][]= new int[arr.length][2];

        //sorting array of input elements
        Arrays.sort(arr);
        //to print sorted array elements
        /* for(int i :arr)
        { 
            System.out.print(i+",");
        } */
    
        //Logic
        newArr[row][0]=arr[0];//placing first element of sorted array into the new array as first value

        //To enter remaining elements into the array (newArr)
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                //incrementing second coloumn
                newArr[row][1] = newArr[row][1] + 1;
            }
            else
            {
                //going to next row by incrementing and placing that element into that next row
                row++;
                newArr[row][0]=arr[i];
            }
        } 
        //to know number of rows
        row++;
        System.out.println("number of rows "+row);
        //calling method to sort multidimensional(newArr) array
        newArr=sort(newArr);
        
        //printing descended array elemnts based on frequency as output
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<=newArr[i][1];j++)
            {
                System.out.print(newArr[i][0]+" ");
            }
        }
        System.out.println();
    }
    
    //considering element and frquency as one row and sorting all the rows in the array
    public static int[][] sort(int nArr[][])
    {
        int temp[]= new int[2];
        
        for(int i=0;i<row;i++)
        {
            for(int j=i;j<row;j++)
            {
                if(nArr[i][1] < nArr[j][1])
                {
                    temp=nArr[i];
                    nArr[i]=nArr[j];
                    nArr[j]=temp;
                }
            }
        }
        return nArr; 
    }
     
    
}
