import java.util.Scanner;

public class Cards 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num;
        //input validation....
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scan.next();
            }
            num=scan.nextInt();
    
        }while(num<=0);
        
        System.out.println("Total cards required are "+CardsPyramid(num));//calling and printing the method ouput
        scan.close();
    }
        public static int CardsPyramid(int num)
        {
            int Cards=0;
            for(int i=1;i<=num;i++)//for loop for levels
            {
             Cards=Cards+(num+i);//caluclates how many cards are required
             }
             return Cards;
        }
       
    
    
}
