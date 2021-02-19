package Accenturepgms;

import java.util.*;

public class Ass13 {
    public void collatz(int number){
        if(number %2==0){//pk value is even,pk+1=pk/2
            number=number/2;
        }
        else{//pk is odd,pk+1=(3*pk)+1
            number=(3*number)+1;
        }
    }
    System.out.println(numbers);
    
}
public static void main(String[] args) {
    Object system;
	Scanner obj=new Scanner(System.in);
    int number;
    do{
        System.out.println("enter positive number :");
        while(!obj.hasNextInt()){
            System.out.println("this is not a number.enter positive number :");
            obj.next();
        }
        number=obj.nextInt();
    }while(number<=0);
    System.out.println("its a number :" +number);
    Ass13 obj1=new Ass13();
    obj1.collatz(number);
    
}
