import java.util.Scanner;

public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        //FIRST NUMBER VALIDATION
        int n;
        do 
        {
            System.out.println("ENTER MULTIPLICATION TABLE NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            n=obj.nextInt();
        } while (n <= 0);
        System.out.println("YES IT IS YOUR MULTIPLICATION TABLE NUMBER : " + n);
 
        //SECOND NUMBER VALIDATION
        int n2;
        do 
        {
            System.out.println("ENTER MULTIPLICATION TABLE NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            n2=obj.nextInt();
        }while (n2 <= 0);
        System.out.println("YES IT IS YOUR MULTIPLICATION TABLE NUMBER : " + n2);

        //LOGIC
        System.out.println("****MULTIPLICATION TABLE USING FOR LOOP****");
        for(int i=1;i<=10;i++)//Multiplication using "for" loop
        {
            System.out.println(n+" x "+i+" = "+n*i);
            
        } 

        System.out.println("****MULTIPLICATION TABLE USING WHILE LOOP****");
        int j=1;
        while(j<=10)//Multiplication using while loop
        {
            System.out.println(n2+" x "+j+" = "+n2*j);
            j++; 
        }
        obj.close();  
    }
}
