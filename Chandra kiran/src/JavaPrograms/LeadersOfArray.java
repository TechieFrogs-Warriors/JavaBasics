package JavaPrograms;

import java.util.Scanner;

public class LeadersOfArray 
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
        int temp=0;
        for(int i=0;i<normalArray.length;i++)
        {
            int j=i+1;//j value is one greater than i value
            if(normalArray[i]>normalArray[j])//checks if the first elemen is greater then other elements
            {
                temp=normalArray[i];//if greater assign the greater number to temp
                System.out.print(temp+" ");//prints the temp values
                if(i==normalArray.length-2)//checks if the i value length-2
                {
                    System.out.print(normalArray[i+1]);//if true prints the next element 
                    break;
                }

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
