package TcsPrograms;

import java.util.Scanner;

public class WashingMachineWeight 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int weight=InputValidation(scanner);
        WashingMachineWeights(weight);//method calling
        scanner.close();
    }
    public static void WashingMachineWeights(int weight)
    {
        if(weight>0&&weight<7000)//checks the range of weight
        {
            if(weight==2000)//checks the weight value
            {
                System.out.println("Time Estimated:"+25);
            }
            if(weight>2001&&weight<4000)//checks the weight value
            {
                System.out.println("Time Estimated:"+35);
            }
            if(weight>4000)//checks the weight value
            {
                System.out.println("Time Estimated:"+45);
            }
        }
        else
        {
            System.out.println("Invalid Input");
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
