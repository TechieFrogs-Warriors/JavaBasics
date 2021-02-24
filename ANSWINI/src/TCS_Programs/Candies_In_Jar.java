package TCS_Programs;
//Program to find sold out candies and left over candies in a jar

import java.util.Scanner;

public class Candies_In_Jar 
{
    public static void main(String[] args) 
    {
        //Reading input from user
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Number of candies in the jar");
        int jarCandies = Validation.integerValidation(sc);
        System.out.println("How many candies you want to buy?");
        int buyCandy = Validation.integerValidation(sc);
        
        //Logic
        if(buyCandy <= 0 || (buyCandy > jarCandies))
        {
            System.out.println("Invalid Input");
            System.out.println("Number of candies left: "+jarCandies);
        }
        else
        {
            jarCandies = jarCandies - buyCandy;
            System.out.println("Number of candies sold are: "+buyCandy);
            System.out.println("Number of candies Available: " +jarCandies);

        }
        sc.close();
    }
    
}
