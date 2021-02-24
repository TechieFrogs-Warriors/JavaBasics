package AccenturePrograms;

import java.util.Scanner;

//Program to print number of cards required to build a level of pyramid
public class PyramidOfCards 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int level;
        do
        {
            System.out.println("which level pyramid you want");
            while(!sc.hasNextInt())
            {
                System.out.println("Please enter valid postive integer");
                sc.next();
            }
            level=sc.nextInt();

        }while(level<=0);
        System.out.println("so you want "+level+" level pyramid");
        
        //calling method that performs logic
        System.out.println("Number of cards rquired to build "+level+" level pyramid are: "+cardsPyramid(level));
        
    }
    public static int cardsPyramid(int n)
    {
        //Logic
        int cards=(n * ((3 * n) + 1))/2;//fixed formula to find number of cards
        if(cards > 0)
        return cards;
        else return -1;
    }
}
