import java.util.Scanner;

public class Patternpractice2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int n;
        do
        {
            System.out.println("Enter positive row size");
            while(!sc.hasNextInt())
            {
                System.out.println("Enter only Integer number");
                sc.next();
            }
            n=sc.nextInt();

        }while(n<=0);
        System.out.println("Its a valid number"+n);
        int m;
        do
        {
            System.out.println("Enter positive row size");
            while(!sc.hasNextInt())
            {
                System.out.println("Enter only Integer number");
                sc.next();
            }
            m=sc.nextInt();

        }while(m<=0);
        System.out.println("Its a valid number"+m);
       // Patternpractice2 p=new Patternpractice2();//inner class object creation..step 1
      // Patternpractice2.Apple a = p.new Apple();//innerclass object creation...step 2
      //Patternpractice2.Apple a=new Patternpractice2.Apple();//nested class object creation
      Apple a=new Apple();//nested class object creation
        a.add(n, m);


       
        
        sc.close();
    }
   static class Apple
    {
        void add(int a,int b)
    {
        System.out.println("sum is :"+(a+b));
    }
    }
    
    
}
