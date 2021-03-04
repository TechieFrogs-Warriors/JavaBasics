import java.util.Scanner;

public class WallPainting 
{
     //Validation of integer input
     public static int integerValidation(Scanner sc) 
     {
        int number ;
        do
        {
            System.out.println("Enter the positive number");
            while(!sc.hasNextInt())
            {
                System.out.println("your is not integer valur.please enter proper integer value");
                sc.next();
            }
            number =sc.nextInt();
        }while(number < 0);
        return number;
         
    }
    //Validation of double input
    public static double doubleValidation(Scanner sc) 
    {
       double number ;
       do
       {
           System.out.println("Enter the positive number");
           while(!sc.hasNextDouble())
           {
               System.out.println("your is not integer valur.please enter proper integer value");
               sc.next();
           }
           number =sc.nextDouble();
       }while(number < 0);
       return number;
        
   }
    public static void main(String[] args) 
    {
        //read input from user
       Scanner sc = new Scanner(System.in);
        //taking the number of how many walls are there to paint
       int interiorCount = integerValidation(sc);
       int exteriorCount = integerValidation(sc);
       if(interiorCount==0 && exteriorCount==0)
       {
           System.out.println("there is no need to paint the house");
       }

       double[] interiorWallSize = new double[interiorCount];
       double[] exteriorWallSize = new double[exteriorCount];

       //variables to store sum of interiorwall cost and exterior wall cost
       double inWallSum =0,exWallSum =0;
        //Entering elements into arrays
       for(int i=0;i<interiorWallSize.length;i++)
       {
           interiorWallSize[i] = doubleValidation(sc) * 18 ;

       }
       for(int i=0;i<exteriorWallSize.length;i++)
       {
           exteriorWallSize[i] = doubleValidation(sc) * 12 ;

       }
       //sum of all interior wall costs
       for(double sum:interiorWallSize)
       {
           inWallSum += sum;
       }
       //sum of all exterior wall costs
       for(double sum2:exteriorWallSize)
       {
           exWallSum += sum2;
       }
       //printing the output cost of painting total house
       System.out.println("Total painting cost of the house: "+(inWallSum+exWallSum)+" INR");
       sc.close();


        
    }
    
}
