public class HalfPyramidAlphabets 
{
    public static void main(String[] args) 
    {
        char alphabet ='A';
        for (int i = 0; i<= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(( alphabet + " "));
            }
            alphabet++;
            System.out.println();
        }
        
        /*
        int number =1;
        for (int i = 0; i<=4; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(( number + " "));
            }
            number++;
            System.out.println();
        } */

    }
    
}
