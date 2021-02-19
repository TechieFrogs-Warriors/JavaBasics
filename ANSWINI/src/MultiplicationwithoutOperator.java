import java.math.BigDecimal;

public class MultiplicationwithoutOperator 
{
    public static void main(String[] args) 
    {
        System.out.println("Multiplication result of two numbers is: "+multiplication(4, 5));
        //using bigdecimal from math package
        System.out.println("using bigdecimal math methods: "+new BigDecimal("3").multiply(new BigDecimal("5")));
        //calling method which is using loop
        System.out.println("Using for loop multiplication result is: "+multiplierLoop(8, 6));
        //calling method which is using recursion
        System.out.println("Multiplication result using recursion: "+multiplier(9, 4));

        
    }
    //using operators other than *
    static int multiplication(int n, int m) 
    {
        int ans = 0;
    
        while (m > 0) 
        {
            if ((m & 1) != 0)
            ans = ans + n;
    
            n = n << 1;
            m = m >> 1;
        }
        return ans;
    }

    //using loop
    public static int multiplierLoop(int a, int b) 
    {
        int resultat = 0;
        for (int i = 0; i < a; i++) 
        {
            resultat += b;
        }
    
        return resultat;
    }

    //using recursion method
    public static int multiplier(int a, int b) 
    {

        if ((a == 0) || (b == 0))
        return 0;
        else
        return (a + multiplier(a, b - 1));
    
    }
    
    
}
