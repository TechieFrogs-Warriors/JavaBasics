package TcsPrograms;

import java.util.Scanner;

public class Painting 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double InteriorWalls=InputValidation(scanner);
        double ExteriorWalls = InputValidation(scanner);
        double InteriorWall[]=new double[(int) InteriorWalls];
        System.out.println("Enter the Interiorwall elements");
        for(int i=0;i<InteriorWall.length;i++)//for loop for array elements
        {
            InteriorWall[i]=scanner.nextDouble();
        }
        double ExteriorWall[]= new double[(int) ExteriorWalls];
        System.out.println("Enter the Exteriorwall elements");
        for(int i=0;i<ExteriorWall.length;i++)//for loop for array elements
        {
            ExteriorWall[i]=scanner.nextDouble();
        }
        double Interiorcost=SumOfWalls(InteriorWall)*18;//cost for Interior wall painting
        double Exteriorcost=SumOfWalls(ExteriorWall)*12;//cost for Exterior wall painting
        double Totalcost=Interiorcost+Exteriorcost;
        System.out.println("Total Estimated Cost "+Totalcost);
    }
    public static double SumOfWalls(double arr[])
    {
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];//sum of all array elements
        }
        return sum;
    }
    public static double InputValidation(Scanner scanner)
    {
        double num;
        do
        {
            System.out.println("Enter the valid number");
            while(!scanner.hasNext())
            {
                System.out.println("Entered number  is not valid .Please enter valid number");
                scanner.next();
            }
            num=scanner.nextDouble();
        }while(num<=0);
        return num;
    }
    
}
