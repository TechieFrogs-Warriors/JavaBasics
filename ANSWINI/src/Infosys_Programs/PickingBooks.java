package Infosys_Programs;

import java.util.Scanner;

import TCS_Programs.Validation;

//To find probability of picking specific books from library
public class PickingBooks 
{
    public static int books(int n,int m,int k,int x)
    {
        //5c1 * 4cx * 2cx where x=2 as per question
        int ways = (n/(x-1)) * (m *(m-1))/x * (k *(k-1))/x ;
         
        return ways;
    }
    public static void main(String[] args) 
    {
        //Reading input from user after validating them
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many maths books are there");
        int n = Validation.integerValidation(sc);
        System.out.println("Enter how many chemistry books are there");
        int m = Validation.integerValidation(sc);
        System.out.println("Enter how many science books are there");
        int k = Validation.integerValidation(sc);
        System.out.println("Number of books Alisa want");
        int x = Validation.integerValidation(sc);

        //calling probability calculating method
        int noOf_Ways = books(n,m,k,x);
        //printing number of aways the required books can be picked
        System.out.println("Number of ways to buy all books: "+noOf_Ways);
        sc.close();

    }
}
