package TCS_Programs;
//Given series of numbers are 1,2,3,4,5,6,8,9,10,12,14,15…….n. 
//The digits are factors of 2, 3 and 5.Find the nth term of the series.(also called as ugly series)
import java.util.Scanner;

public class NewSeries 
{
    public static void main(String[] args) 
    {
        //Reading user input
        Scanner sc =new Scanner(System.in);
        System.out.println("which term you want from the series?");
        int number = Validation.integerValidation(sc);//which term you want from series

        //Logic
        int nterm=0;//initializing nterm as zero.
        //Loop to find the nth term 
        while(number>0)
        {
            nterm++;

            //if nterm is equal to 1,then decrement the input number
            if(nterm==1)
            {
                number--;
            }

            //if 'nterm' is divisible by 2 or 3 or 5,then decrement the input number
            if(nterm % 2 == 0 ||nterm % 3 == 0||nterm % 5 == 0 )
            {
                number--;
                
            }
        }
        //printing the nth term
        System.out.println("nth term of the series is: "+nterm);
        
    }
    
}
