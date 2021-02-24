package TcsPrograms;

import java.util.Scanner;



public class PathsFare 
{
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       int Path[]={800, 600, 750, 900, 1400, 1200, 1100, 1500};
       String BusStops[]={"TH","GA","IC","HA","TE","LU","NI","CA"}; 
       String Source=StringInputValidation(scanner);
       String Destination=StringInputValidation(scanner);
        getFare(Source,Destination,Path,BusStops);

    }
    public static void getFare(String Source,String Destination,int Path[],String BusStops[])
    {
        float Fare=0,sum=0;
        int Start=0,End=0;
        for(int i=0;i<BusStops.length;i++)
        {
            if(BusStops[i].equals(Source))
            {
                Start=i;//gives the index of source
                
            }
            if(BusStops[i].equals(Destination))
            {
                 End=i;//gives of destination
            }
        }
        if(Start==End)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
             if(Start==BusStops.length-1)//checks if source is last element
             {
                 for(int j=0;j<End;j++)
                 {
                         
                     sum=sum+Path[j];//prrints the path values from starting point to end
                 }
                  Fare=sum/200;
                 System.out.println((float)Math.ceil(Fare)+"INR");
             }
             else if(Start>End)
             {
                 for(int i=Start+1;i<=Path.length-1;i++)
                 {
                     sum=sum+Path[i];//sum of path values 
 
                 }
                 for(int j=0;j<=End;j++)
                 {
                     sum=sum+Path[j];//sum of the path values 
                 }
                 Fare =(float)Math.ceil(sum/200);//Caluclates the fare of total journey
                 System.out.println(Fare+"INR");
                 
             }
             else
             {
                 for(int i=Start+1;i<End;i++)
                 {
                     sum=sum+Path[i];//sum of path values 
 
                 }
                  Fare =(float)Math.ceil(sum/200);//caluclates fare of total journey
                  System.out.println(Fare+"INR");
 
             }
            //  Fare=sum/200;
            //  System.out.println((float)Math.ceil(Fare)+"INR");
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
    public static String StringInputValidation(Scanner scanner)
    {
        String Str;
        do
        {
            System.out.println("Enter valid String");
            while(!scanner.hasNext("[A-Za-z]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                scanner.next();
            }
            Str=scanner.nextLine();
        
    
        }while(Str==" ");
        return Str;
    }
    
}
