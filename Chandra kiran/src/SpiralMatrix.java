import java.util.Scanner;

public class SpiralMatrix 
{
    /*1. Create a 2D array of size n
    2. Store the boundary of the array in boundary variable. Initially it will be n-1 and thereafter it changes after every rotation.
    3. Store the size left for the spiral printing in variable sizeLeft. Initially it will be n-1 and thereafter it will decrease by 1 after every 2 rotations.
    4. Create a flag to determine 2 rotations, as after every 2 rotations, the sizeLeft will decrease.
    5. Create a char variable move to store the current movement of the spiral pattern. It can have ‘r’ for right, ‘l’ for left, ‘d’ for down, and ‘u’ for up.
    6. Repeat the below steps till ‘i’ is in range [1, n^2]:
    7. Assign the value of i to the spiral pattern.
    8. Determine the next movement of the pattern.
    9. Check for pattern to reach boundary. If reached, modify the sizes and rotate the spiral pattern.
    10. Print the Spiral Pattern stored in the 2D array. */
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
        Spiralmatrix(size);
        scan.close();
    }
    public static void Spiralmatrix(int size)
    {
        int arr[][] = new int[size][size];
        int boundary=size-1;
        int sizeleft=size-1;
        int flag=1,i;
        int row=0,col=0;
        char move='r';
        for(i=1;i<=(size*size);i++)
        {
            arr[row][col]=i;
            switch(move)
            {
                case 'r':
                col=col+1;//cloumns will be increamented
                break;
                case 'd':
                row=row+1;//rows will be increamented
                break;
                case 'l':
                col=col-1;//columns will be decreamented
                break;
                case 'u':
                row=row-1;//rows will be decremented
                break;
                default:System.out.println("default");
            }
        
            if(i==boundary)//checks the boundary value
            {
                System.out.println(boundary);
                boundary=boundary+sizeleft;//boundary value will be increamented
                if(flag!=2)//checks flag value
                {
                    flag=2;
                }
                else
                {
                    flag=1;
                    sizeleft=sizeleft-1;//sizeleft value will be decreamented
                }
                switch(move)
                {
                    case 'r':
                    move='d';//move will be down
                    break;
                    case 'd':
                    move='l';//move will be left
                    break;
                    case 'l':
                    move='u';//move will be up
                    break;
                    case 'u':
                    move='r';//move will be right
                    break;
                    default:System.out.println("default");
                }
            }
        }
        
        
            for( i=0;i<size;i++)//for loop for rows
            {
                for(int j=0;j<size;j++)//for loop for columns
                {
                    System.out.print(arr[i][j]+" ");//printing the array
                }
                System.out.println();

            }

            
    }

}

        

        
        
    
    

