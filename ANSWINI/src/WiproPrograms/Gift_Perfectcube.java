package WiproPrograms;

import java.util.Scanner;

public class Gift_Perfectcube 
{
    public static int numberOfProducts;

    //validation
    public static int inputValidation(Scanner sc) 
    {
        do 
        {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) 
	        {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }

            numberOfProducts = sc.nextInt();

        } while (numberOfProducts <= 0);

        return numberOfProducts;
    }

    //Method to find cube root
    public static int perfectCube(int tp) 
    {
        int requiredAmount=0;
        int num = (int) Math.floor(Math.cbrt(tp)) + 1;// formula
        int pc = num * num * num;
        if (tp == pc) 
	    {
            System.out.println("Yes");
        } 
        else // if not equal then gives the how much number to reach the perfect cube
        {
            requiredAmount = pc - tp;
            System.out.println("\n Required money to pay to get Gift hamper is : " + requiredAmount);
        }
        return requiredAmount;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of products purchased(Array size) : ");
        numberOfProducts = inputValidation(sc);
        System.out.println("Enter the Price of items : ");
        int[] price = new int[numberOfProducts];//Array to take elements
        for (int i = 0; i < numberOfProducts; i++) 
	    {
            price[i] = sc.nextInt();
        }
        //Logic
        int totalPrice = 0;
        System.out.println("Total price of products : ");
        for (int i = 0; i < price.length; i++) 
	    {
            totalPrice += price[i];
        }

        System.out.print(totalPrice); 

        perfectCube(totalPrice); // calls perfectCube method
        

    }
    
}
