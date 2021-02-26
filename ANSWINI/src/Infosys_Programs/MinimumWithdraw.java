package Infosys_Programs;

import java.util.Scanner;

import TCS_Programs.Validation;

public class MinimumWithdraw 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N=Validation.integerValidation(sc);
        int ATM[]= new int[N];
        for(int i=0;i<ATM.length;i++)
        {
            ATM[i]=Validation.integerValidation(sc);
        }
        int X=Validation.integerValidation(sc);
        int withdraw=minimumWithdrawal(ATM,N,X);//method calling
        if(withdraw==-1)//checks the withdraw value
        {
            System.out.println("Sarah cannot withdraw "+withdraw);
        }
        else
        {
            System.out.println("Minimum number of withdraws are: "+withdraw);
        }
        
    }
    public static int minimumWithdrawal(int ATM[],int N,int X)
    {
        int min=0,sum=0;

            for(int i=0;i<ATM.length;i++)
            {
                sum=sum+ATM[i];//adds the amount in atm
                min++;//increment min
                if(sum>=X)//checks if sum greater than or equal to withdraw
                {
                    break;
                }
                
            }
            if(X>sum)//checks the withdrawal amount
            {
                min=-1;//min value will be -1

            }
        
        return min;
        
    }
    
}
