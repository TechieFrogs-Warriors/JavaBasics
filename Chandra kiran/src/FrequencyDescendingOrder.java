import java.util.*;

public class FrequencyDescendingOrder 
{
    public static int row=0;
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int size;
       //input validation....
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNext())
            {
                System.out.println("Entered value is not valid.Please enter valid number");
                scan.next();
            }
           size =scan.nextInt();
        }while(size<=0); 
        int arr[] = new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        
        Arrays.sort(arr);//Sorting the given array
        int arr1[][]=new int[arr.length][2];
        arr1[row][0]=arr[0];//Assigning first element of arr to 1st postion of arr1
        for(int i=1;i<size;i++)
        {
            if(arr[i]==arr[i-1])//checks whether there are repeating elements
            {
                 
                arr1[row][1]=arr1[row][1]+1;//increaments the frequency and assign to next column
            }
            else
            {
                row++;
                arr1[row][0]=arr[i];//no repeating of same element then adds to next row
            }

        }
        row++;//increament row
        arr1=sort(arr1);//Calling method
        for(int i=0;i<row;i++)//for loop for rows
        {
            for(int j=0;j<=arr1[i][1];j++)//for loop for only one coloumn
            {
                System.out.print(arr1[i][0]+" ");//prints only elements in descending order of their frequency
            }
             
        }
        System.out.println();
        scan.close();
    }
    public static int[][] sort(int arr[][])
    {
        int temp[]=new int[2];
        for(int i=0;i<row;i++)
        {
            for(int j=i;j<row;j++)
            {
                if(arr[i][1]<arr[j][1])//condition for sorting the array in frequency order 
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        return arr;
    }
}