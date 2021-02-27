package TCS_Programs;

import java.util.Scanner;

//program to find monkeys left on tree
public class MonkeysLeftOnTree 
{
   public static void main(String[] args) 
   {
       //Reading input from user
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter number of monkeys on tree");
       int n = Validation.integerValidation(sc);

       System.out.println("Enter number of bananas eaten by one monkey ");
       int k = Validation.integerValidation(sc);

       System.out.println("Enter number of peanuts eaten by one monkey ");
       int j = Validation.integerValidation(sc);

       System.out.println("Enter number of bananas");
       int m = Validation.integerValidation(sc);

       System.out.println("Enter number of peanuts");
       int p = Validation.integerValidation(sc);

       //Logic
       int bananaEatenMonkeys=0,peanutsEatenMonkeys=0;
       if(k>0)
        {
           bananaEatenMonkeys = m/k; //no.of monkeys eaten bananas 
        }
        if(j>0)
        {
            peanutsEatenMonkeys = p/j; //no.of monkeys eaten peanuts
        }

        //removing the eaten monkeys from total monkeys on thtree
        n = n-bananaEatenMonkeys-peanutsEatenMonkeys;
        System.out.println("Number of monkeys left on tree: "+n);
    }

}
