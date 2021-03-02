package JavaPrograms;


import java.util.Scanner;

public class ZerosOfArray 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int arraySize=InputValidation(scanner);
        int normalArray[]=new int[arraySize];
        System.out.println("Enter the array elements");
        for(int i=0;i<normalArray.length;i++)//for loop for entering array elements
        {
            normalArray[i]=scanner.nextInt();
        }
        for(int i=0;i<normalArray.length;i++)
        {
            if(normalArray[i]==0)//checks the if element is zero
            {
                System.out.print(normalArray[i]+" ");//prints all the zeros of array
            }
        }
        for(int i=0;i<normalArray.length;i++)
        {
            if(normalArray[i]!=0)//checks if the element is non-zero 
            {
                System.out.print(normalArray[i]+" ");//prints all non-ero elements of array
            }
        }

        
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
