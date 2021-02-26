package TCS_Programs;

import java.util.Scanner;

//Program to give output of time taken by washing machine to wash as per input given
public class WashingMachine 
{
    public static int inputValidation(Scanner sc)
    {
        //Input validation
        int number;
        do
        {
            System.out.println("Enter your number");
            while(!sc.hasNextInt())
            {
                System.out.println("please enter a positive or valid integer");
                sc.next();
            }
            number = sc.nextInt();

        }while(number<=0);
        return number;
    }
    //Method that performs logic
    public static void machine_Time_calculator(int givenLoad)
    {
        if(givenLoad>0 && givenLoad<=2000)
        {
            System.out.println("Time Estimated: "+"25 Minutes");
        }
        else if(givenLoad>2000 && givenLoad<=4000)
        {
            System.out.println("Time Estimated: "+"35 Minutes");
        }else if(givenLoad>4000 && givenLoad<=7000)
        {
            System.out.println("Time Estimated: "+"45 Minutes");
        }
        else
        {
            System.out.println("OVERLOADED");
        }
    }
    public static void main(String[] args) 
    {
        //Reading user input and validating it
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter load in grams you want to put in the machine");
        int load = inputValidation(sc);
        //method that performs logic
        machine_Time_calculator(load);

        sc.close();
    }
}
