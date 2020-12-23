import java.util.Scanner;

public class HackerRankMultiplication 
{
    public static void main(String[] args) 
    {
        System.out.println("What Multiplication Table you want : ");
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        
        int x;
        for(int i=1;i<=10;i++)
        {
            
            System.out.println(N+" x "+i+" = "+N*i);
            obj.close();
        }
        
    }
    
}
