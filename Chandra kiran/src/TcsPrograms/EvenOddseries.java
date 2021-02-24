package TcsPrograms;

import java.util.Scanner;

public class EvenOddseries 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int term=InputValidation(scanner);
        int Series[]= new int[term];
        
        for(int i=0;i<Series.length;i++)
        {
            
            if(i%2==1)
            {
                int j=i/2;//takes the half value of i
                Series[i]=(j*6);//gives the increament of six multiples
                System.out.print(Series[i]+" ");
            }  

            else
            {
                int j=i/2;
                Series[i]=(j*7);//gives the increament of seven multiples
                System.out.print(Series[i]+" ");
            }
            if(i==Series.length-1)//prints the last element of series
            {
                System.out.println(Series[i]);
            }
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
