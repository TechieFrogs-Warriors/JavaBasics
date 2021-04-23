import java.util.Scanner;

public class LCM_OfTwoNumbers
 {
    public static void main(String[] args) 
    {
        int gcd=1,lcm;
       Scanner obj=new Scanner(System.in);
       System.out.println("ENTER YOUR TWO NUMBERS");
       int firstNum=obj.nextInt();
       int secondNum=obj.nextInt();

       for(int i=1;i<=firstNum && i<=secondNum;i++)
       {
           if(firstNum%i==0 && secondNum%i==0)
           gcd=i;

       }
       lcm=firstNum*secondNum/gcd;
       System.out.println("LCM OF "+firstNum+" AND "+secondNum+" IS = "+lcm);
       obj.close();
        
    }
   
    
}
