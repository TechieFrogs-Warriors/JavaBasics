package TCS_Programs;

import java.util.Scanner;

//program to find doctor fee for the day
public class DoctorFee 
{
    public static void main(String[] args) 
    {
        //Reading input from user and validating them
        Scanner sc=new Scanner(System.in);
        int[] ageArray = new int[Validation.integerValidation(sc)];
        //Taking array elements 
        for(int i=0;i<ageArray.length;i++)
        {
            ageArray[i] = Validation.integerValidation(sc);
        }

        //Logic
        //Taking individual fee into fee array
        int[] fee = new int[ageArray.length];
        for(int i=0;i<ageArray.length;i++)
        {
            if(ageArray[i]>0 && ageArray[i]<17)
            {
                fee[i] = 200;
            }
            if(ageArray[i]>=17 && ageArray[i]<40)
            {
                fee[i] = 400;
            }
            if(ageArray[i]>=40 && ageArray[i]<=120)
            {
                fee[i] =  300;
            }
            else
            {
                System.out.println("Invalid Input");
            }

        }
        //calculating the total fees per day
        int total_Fee=0;
        for(int i=0;i<fee.length;i++)
        {
            total_Fee = total_Fee +fee[i];
        }
        System.out.println("Total Income: "+total_Fee+" INR");
       
        sc.close();
        
    }
    
}
