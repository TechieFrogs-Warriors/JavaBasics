package AccenturePrograms;

import java.util.Scanner;

//program  to find nth term in collatz sequence
public class CollatzSequence 
{
    public static void main (String[] args)  
    { 
        //Taking user input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter collatz series starting number");
        int num=sc.nextInt();

        //calling method that performs logic
        collatzSequence(num); 
        sc.close();
    } 
    static void collatzSequence(int number) 
    {  
		//Logic
		while (number!=1)
        {
			if (number % 2 == 0)
			{	
				System.out.print(number+" ");
				int even = number/2;//formula for even number
                number=even;
				
			}
			else if (number % 2 != 0)
			{
				System.out.print(number+" ");
				int odd = (3*number)+1;//formula for odd number
                number=odd;
				
			}
           
        }
        System.out.print(number);//printing '1'
				
    } 
    
}
