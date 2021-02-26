package TCS_Programs;

import java.util.Scanner;

//program to find bus fare from one busstop to another busstop
public class BusFare 
{

	public static void main(String[] args) 
    {
        //Reading user input
        Scanner sc = new Scanner(System.in);
    
        String[] bus_Stops = new String[Validation.integerValidation(sc)];
        int[] paths=new int[Validation.integerValidation(sc)];

        //Entering elements into bus_stops array
        System.out.println("Enter the busstop array elements ");
        for(int i=0;i< bus_Stops.length; i++) 
        {
            bus_Stops[i] = Validation.stringValidation(sc);
        }

        //Entering elements into patha array
        System.out.println("Enter the path array elements");
        for(int i=0;i<paths.length;i++)
        {
            paths[i]=Validation.integerValidation(sc);
        }
        
        //Logic

        String source=Validation.stringValidation(sc);
        String destination=Validation.stringValidation(sc);
        float fare = 0;
        int start = 0,stop = 0;
        for(int i=0;i<bus_Stops.length;i++)
        {
            if(source.equals(bus_Stops[i])) 
            start = i;
            
            if(destination.equals(bus_Stops[i]))
            stop = i;
        }
        
        if(start == stop)
        {
            System.out.println("Invalid Output");
            
        }
        else
        {
            //setting starting point 
            int i = start+1; int finalDistance=0;
           //loop to run through all paths till destination reached
            while(i!=stop+1)
            {
                //calculating fare by adding them across the path it travelled
                finalDistance= finalDistance + (paths[i]);
                //To rotate through the loop(incrementing i value)
                i = (i+1) % paths.length;
            } 

            //multiplying distance covered(in mtr) with cost per mtr
            fare = (float) (finalDistance * 0.005);
            
            //finally the fare is displayed
            System.out.println(Math.ceil(fare)+" INR");
            
        }

        sc.close();
    }
    
}
