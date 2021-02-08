import java.util.Scanner;

public class LargeNumberInArray 
{
    public static void main(String[] args) 
    {
        int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("what is you array size?");
        n = s.nextInt();

        int a[] = new int[n];//'a' is array name.'n' is array size

        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();//taking values one by one into array 'a'
        }

        max = a[0];//passing first value of array to 'max' to compare with next values
        
        for(int i = 0; i < n; i++)
        {
            if(max > a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
        s.close();
    }
    
}
