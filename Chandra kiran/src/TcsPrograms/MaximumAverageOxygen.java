package TcsPrograms;

import java.util.Scanner;

public class MaximumAverageOxygen 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int OxygenValue11=InputValidation(scanner);
        int OxygenValue12=InputValidation(scanner);
        int OxygenValue13=InputValidation(scanner);
        int OxygenValue21=InputValidation(scanner);
        int OxygenValue22=InputValidation(scanner);
        int OxygenValue23=InputValidation(scanner);
        int OxygenValue31=InputValidation(scanner);
        int OxygenValue32=InputValidation(scanner);
        int OxygenValue33=InputValidation(scanner);
        int Trainee1=AverageOxygenValue(OxygenValue11,OxygenValue21,OxygenValue31);//method calling gives the average Oxygenvalue of trainee1
        int Trainee2=AverageOxygenValue(OxygenValue12,OxygenValue22,OxygenValue32);//method calling gives the average OxygenValue of trainee2
        int Trainee3=AverageOxygenValue(OxygenValue13,OxygenValue23,OxygenValue33);//method calling gives the average OxygenValue of trainee3
        int MaximumAverageOxygenValue=MaximumAverageOxygenValue(Trainee1,Trainee2,Trainee3);//method calling gives MaximumAverageOxygenValue
        if(MaximumAverageOxygenValue<70)//checks the MaximumAverageOxygenValue
        {
            System.out.println("All the trainees are Unfit");
        }
        if(Trainee1==MaximumAverageOxygenValue)//checks the MaximumAverageOxygenValue with Trainee1 AverageOxygenValue
        {
            System.out.println("Trainee Number "+1);//if equal prints the trainee number 1
            
        }
        if(Trainee2==MaximumAverageOxygenValue)//checks the MaximumAverageOxygenValue with Trainee2 AverageOxygenValue
        {
            System.out.println("Trainee Number "+2);//if equal prints the trainee number 2
        }
        if(Trainee3==MaximumAverageOxygenValue)//checks the MaximumAverageOxygenValue with Trainee3 AverageOxygenValue
        {
            System.out.println("Trainee Number "+3);//if equal prints the trainee number 3

        }
        scanner.close();
            
    }
    public static int AverageOxygenValue(int OxygenValue1,int OxygenValue2,int OxygenValue3)
    {
        int Average=(OxygenValue1+OxygenValue2+OxygenValue3)/3;
        return Average;
    }
    public static int MaximumAverageOxygenValue(int num,int num1,int num2)
    {
        int Maximum1=Math.max(num, num1);
        int Maximum2=Math.max(Maximum1, num2);
        return Maximum2;

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
