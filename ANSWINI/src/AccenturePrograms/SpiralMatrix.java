package AccenturePrograms;

import java.util.Scanner;
//program to print spiral matrix of size N
public class SpiralMatrix 
{
    public static void printSpiral(int n) 
    {
        //Row and coloumn used to go around the matrix
        int row = 0,col = 0;
        int boundary = n-1,sizeLeft = n-1;
        int flag = 1;
        char move = 'r';//Initially will move right side
        //Matrix array
        int[][] arrMat = new int[n][n];
        for(int i=1;i<n*n+1;i++)
        {
            arrMat[row][col] = i;//Assigning value to matrix
            switch(move)
            {
                case 'r' : col++; break; //r=right
                case 'l' : col--; break; //l=left
                case 'u' : row--; break; //u=up
                case 'd' : row++; break; //d=down
            }
            if(i==boundary)//check if matrix has reached array boundary
            {
                boundary = boundary + sizeLeft;
                if(flag != 2)
                {
                    flag = 2;
                }
                else
                {
                    flag = 1;
                    sizeLeft -- ;
                }
                //To control movement where printing should be done
                switch(move)
                {
                    case 'r' : move ='d'; break; //if you are on right side move downwards
                    case 'd' : move ='l'; break; //if you are on down side move left side
                    case 'l' : move ='u'; break; //if you are on leftside move upwards
                    case 'u' : move ='r'; break; //if you are on up side move right side

                }
            }
        }
        //Printing the output spiral matrix
        System.out.println("Spiral matrix of given length is: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arrMat[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of spiral matrix");
        int N =sc.nextInt();
        printSpiral(N);
        sc.close();
    }
    
}
