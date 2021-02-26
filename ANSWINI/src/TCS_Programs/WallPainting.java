package TCS_Programs;

import java.util.Scanner;

//Program to find wall painting cost for a property
public class WallPainting 
{
    //Integer validation
    public static double doubleValidation(Scanner sc)
    {
        double number;
        do
        {
            System.out.println("Enter your number");
            while(!sc.hasNextDouble())
            {
                System.out.println("please enter a positive or valid integer");
                sc.next();
            }
            number = sc.nextDouble();

        }while(number<0);
        return number;
    }
    public static void main(String[] args) 
    {
        //Reading user input and validating them
        Scanner sc =new Scanner(System.in);
        System.out.println("How many interior walls are there?");
        double[] interiorWalls = new double[Validation.integerValidation(sc)] ;
        System.out.println("How many exterior walls are there?");
        double[] exteriorWalls = new double[Validation.integerValidation(sc)];
        //to store total cost for interior and exterior walls
        double inSum =0,exSum=0;
        
        //Reading interior input values and multiplying them with given cost 
        for(int i=0;i<interiorWalls.length;i++)
        {
            interiorWalls[i] = (doubleValidation(sc) * 18);
            
        }
        // total cost for interior walls
        for(double i : interiorWalls)
        {
            inSum += i;
        }
        //Reading exterior input values and multiplying them with given cost 
        for(int i=0;i<exteriorWalls.length;i++)
        {
            exteriorWalls[i] = exteriorWalls[i] + (doubleValidation(sc) * 12);
            
        }
        //total cost for exterior walls
        for(double j : exteriorWalls)
        {
            exSum += j;
        }
        
        //printing total cost of painting the property
        System.out.println("Total cost for painting the property is: "+(inSum+exSum));
        sc.close();

    }
}
