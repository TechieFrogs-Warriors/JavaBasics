package TcsPrograms;

import java.util.Scanner;

public class DoctorFees 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int Patientage[]= new int[InputValidation(scanner)];
        int fees[]=new int[InputValidation(scanner)];
        int sum=0;
        for(int i=0;i<Patientage.length;i++)
        {
            Patientage[i]=scanner.nextInt();
            
            if(Patientage[i]<17)//checks the age less than 17
            {
              fees[i]=200;
            }
            if(17<Patientage[i]&&Patientage[i]<40)//checks the age between 17 and 40
            {
                fees[i]=400;
            }
            if(Patientage[i]>=40)//checks the age greater than 40
            {
                fees[i]=300;
            }
            
            sum=sum+fees[i];//adds the total fees

        }
            System.out.println("Total Income "+sum);
            
    }

        
    
    public static int InputValidation(Scanner scanner)
    {
        int num;
        do
        {
            System.out.println("Enter the positive number number");
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
