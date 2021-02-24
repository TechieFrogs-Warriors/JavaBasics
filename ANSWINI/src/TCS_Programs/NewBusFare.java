package TCS_Programs;

import java.util.Scanner;

public class NewBusFare 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int Stops=Validation.integerValidation(sc);
       int paths[]=new int[Stops];
       String busStops[]= new String[Stops+1];
       System.out.println("Enter the array elements ");
       for(int i=0;i<paths.length;i++)
       {
           paths[i]=Validation.integerValidation(sc);
       }
       System.out.println("Enter the array elements");
       for(int i=0;i<busStops.length;i++)
       {
           busStops[i]=Validation.stringValidation(sc);
       }
        
       float fare=0,sum=0;
       int start=0,stop=0;
       String Source=Validation.stringValidation(sc);
       String Destination=Validation.stringValidation(sc);
      // int Fare=getFare(Source,Destination);
       for(int i=0;i<busStops.length;i++)
        {
           if(busStops[i].equals(Source))
            {
               start=i;
            }
           if(busStops[i].equals(Destination))
            {
                stop=i;
            }
        }
       if(start==stop)
       {
           System.out.println("INVALID INPUT");
       }
       else
       {
            if(start==busStops.length-1)
            {
                for(int j=0;j<stop;j++)
                {
                    sum=sum+paths[j];
                }
                fare=sum/200;
                System.out.println((float)Math.ceil(fare));
            }
            else
            {
                for(int i=start;i<paths.length;i++)
                {
                    sum=sum+paths[i];

                }
                for(int j=0;j<stop;j++)
                {
                    sum=sum+paths[j];
                }
                fare =(float)Math.ceil(sum/200);
                System.out.println(fare);
                
            }
       }
      

    }
    
}
