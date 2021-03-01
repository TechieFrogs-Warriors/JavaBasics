package InfosysPrograms;

import java.util.Scanner;

public class Books 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of Mathematics Books");
        int n=InputValidation(scanner);
        System.out.println("Number of Chemistry Books");
        int m=InputValidation(scanner);
        System.out.println("Number of Science Books");
        int k=InputValidation(scanner);
        System.out.println("Number of books Alisa Needs");
        int x=InputValidation(scanner);
        int ways=books(n,m,k,x);//method calling
        System.out.println("numbers ways Alisa Can Buy The Books: "+ways);
        
    }
    public static int books(int n,int m,int k,int x)
    {
        int ways=((n)/(x-1))*((m*(m-1))/x)*((k*(k-1))/x);//gives number ways the books can be selected
        return ways;
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
