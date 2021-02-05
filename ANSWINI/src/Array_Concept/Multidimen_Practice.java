package Array_Concept;

public class Multidimen_Practice 
{
    public static void main(String[] args) 
    {
        System.out.println("................2D Array........................");
        //creating a two dimensional array
        int[][] arr=new int[3][3];//can store 3 rows x 3 col = 9 elements in this array
        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;
        arr[1][0]=11;
        arr[1][1]=21;
        arr[1][2]=31;
        arr[2][0]=12;
        arr[2][1]=22;
        arr[2][2]=33;
        for(int i=0;i<arr.length;i++)//loop for rows
        {
            for(int j=0;j<arr.length;j++)//loop for coloumns
            {
                System.out.print(arr[i][j]+" ");//prints all elements of this array
            }
            System.out.println();
        }
        

        System.out.println(".................3D Array.......................");
        //crating three dimensional array
      //  int[][][] ar=new int[3][3][3];//can store 3x3x3=27 elements in this array
        int[][][] ar = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } }; 
  
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++) 
            {
                for (int k = 0; k < 2; k++)
                {
                    System.out.print(ar[i][j][k]+" ");
                } 
                System.out.println();   
            }
            System.out.println();    
        } 


        System.out.println("..............3d Array with foreach loop..........................");
        //jagged array(all the columns are not equal)
        // create a 3d array with different coloumn sizes
        int[][][] test = { {{1, -2, 3}, {2, 3, 4}} , {{-4, -5, 6, 9}, {1}, {2, 3}} };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) 
        {
            for (int[] array1D: array2D) 
            {
                for(int item: array1D) 
                {
                    System.out.print(item+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
        System.out.println(".................getting classname of array.......................");
        //getting the class name of Java array  
        /* Class c=arr.getClass();
        String name=c.getName();
        //printing the class name of Java array   
        System.out.println(name); */
        System.out.println(arr.getClass());

        System.out.println(".................copying array to another array.......................");
        //copying an array to another array
        char[] a={'a','b','c'};
        char[] b={'d','e','f','g'};
        System.arraycopy(a, 0, b, 1, a.length);//copying a into b
        System.out.println(String.valueOf(b));//replaces values in 'b' with 'a' values

        System.out.println("..................cloning of single dimensional array......................");
        //cloning a single dimensional array(deep copy..means values are copied)
        char[] c=a.clone();//array 'a' is copied to array 'c'
        for(char i:c)
        {
            System.out.println(i);
        }
        System.out.println("..................cloning of Multi-dimensional array......................");
        //cloning multidimensional array(shallow copy...only referenes are copied)
        int[][] arrs=arr.clone();
        for(int[] i : arrs)
        {
            System.out.println(i);
        }

        int[][] z=new int[][]{{1,2,3,4,5},{6,7,8,9,7},{1,2,4,5,7},{5,4,7,8,9},{1,2,3,4,5}};
        arr=z;;
        System.out.println(z.length);
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            System.out.println(arr[i][j]);
        }
    }
    
}
