package Array_Concept;

public class Program22 
{
    public static void main(String[] args) 
    {
        //program to print transpose of matrix
        int[][] arr={{1,2,3} ,{4,5,6},{7,8,9}};
        int[][] t_arr=new int[3][3];//to store the transpose of original matrix

        //to print original matrix
        System.out.println("Original matrix is:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
               System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }

        //Logic
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                t_arr[i][j] = arr[j][i];
            }
        }
        
        //to print transposed matrix
        System.out.println("Transposed matrix is: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
               System.out.print(t_arr[i][j]+" "); 
            }
            System.out.println();
        }

        
        
    }
}
