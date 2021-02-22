package Accenturepgms;
import java.util.*;

public class Ass14 {
    public Void digiRoot(int number){
        int sum=0;
        int remainder;
        while(number>=10){
            sum=0;
            while(number !=0){
                remainder=number%10;///gets remainder value
                number=number/10;//gets quotient value
                sum=sum+remainder;//remainder is added to sum
            }
            if(sum>=10){
                number=sum;
            }
        }
        System.out.println("digiroot of the number is : " +sum);
        return null;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        //validation
        int number;
        do{
            System.out.println("enter number : ");
            while(!sc.hasNextInt()){
                System.out.println("this is not a number-enter positive number :");
                sc.next();
            }
            number=sc.nextInt();
        }while(number<=0);
        System.out.println("it's a number :" +number);


    
        Ass14 obj=new Ass14();
        obj.digiRoot(number);
    
             
    }
       
}
