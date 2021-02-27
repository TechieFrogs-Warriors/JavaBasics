package TCS_Programs;

import java.util.Scanner;

//Program to select  trainees based on their average oxygen level in three rounds
public class TraineeSelection 
{
    public static int inputValidation(Scanner sc)
    {
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
    public static void main(String[] args) 
    {
        //Validation valid = new Validation();
        Scanner sc = new Scanner(System.in);
        //Giving oxygen level values as input for different 
        System.out.println("Enter number of rounds: ");
        int rounds = inputValidation(sc);
        System.out.println("Enter number of trainees: ");
        int trainees = inputValidation(sc);

        //Array to store trainee 
        int[][] traineeArray = new int[rounds][trainees];

        //Entering oxygen level value into array
        System.out.println("Oxygen level values for trainees are: ");
        for(int i=0;i<rounds;i++)
        {
            for(int j=0;j<trainees;j++)
            {
                traineeArray[i][j] =  inputValidation(sc);
                
            }
            System.out.println();
        }

        //Logic
        int[] sum =new int[trainees];
        int[] average = new int[trainees];
        for(int i=0;i<rounds;i++)
        {
            sum[i] = 0;
            for(int j=0;j<trainees;j++)
            {
                if(inputValidation(sc)==0 || inputValidation(sc)>100)
                {
                    System.out.println("Invalid input");
                }
                else
                sum[i] = sum[i] + traineeArray[j][i];
            }
            System.out.println();
        }
        //printing the sum of each trainee values
        for(int s:sum)
        System.out.print(s+" ");
        for(int i=0;i<trainees;i++)
        {
            average[i] = sum[i]/trainees;
        }
        //Printing averages of trainees
        System.out.println("Averages of trainees are :");
        for(int avg:average)
        System.out.print(avg+" ");

        //printing list of trainees fit or unfit
        System.out.println("Selected trainees are: ");
        for(int i=0;i<trainees;i++)
        {
            if(average[i] >= 70)//condition given in question
            {
                System.out.println("Trainee number: "+(i+1));
            }
            else
            {
                System.out.println("Trainee  "+(i+1)+" is unfit");
            }
        }
        sc.close();
        
    }
    
}
