package InfosysPrograms;

import java.util.Scanner;

public class SpecialArray 
{
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       int N=InputValidation(scanner);
       int A[]=new int[N];
       System.out.println("Enter array elements");
       for(int i=0;i<A.length;i++)
       {
           A[i]=InputValidation(scanner);
       }
       System.out.println("number which is to be placed");
       int X=InputValidation(scanner);
       int moves=specialArray(N,A,X);//method calling
       System.out.println("Number of moves required are: "+moves);


    }
    public static int specialArray(int N,int A[],int X)
    {
        int count=0;
        for(int i=0;i<A.length;i++)//for loop for array traverse
        {
            if(A[i]!=X)//checks the array element is equal to X
            {
                A[i]=X;//replaces the array element with x
                count++;//increaments count value

            }
        }
        return count;//returns the count value

    }
    public static int InputValidation(Scanner scanner)
    {
        int num;
        do
        {
            System.out.println("Enter the valid number");
            while(!scanner.hasNext())
            {
                System.out.println("Entered number  is not valid .Please enter valid number");
                scanner.next();
            }
            num=scanner.nextInt();
        }while(num<=0);
        return num;
    }
    
    
}
