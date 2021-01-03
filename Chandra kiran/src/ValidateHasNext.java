import java.util.Scanner;
public class ValidateHasNext {
    public static void main(String[] args) {
        
        
        Scanner num= new Scanner(System.in);
      int i;
        do{
            System.out.println("enter positive number");
            while(!num.hasNextInt())
            {
                String input = num.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          i=num.nextInt();
        }while(i<0);
if(i%2==0){
    System.out.println("i is even");

}
else{
    System.out.println("i is ood");

}
num.close();

   
    Scanner num1= new Scanner(System.in);
float f;
do {
    System.out.println("Enter positive number");
    while(!num1.hasNextFloat()){
        String input =num1.next();
        System.out.printf("\"%s\" is not valid number.Please enter a valid \n",input);
    }
    f=num1.nextFloat();

}while(f<0);
 f=f/2;
System.out.println(f);
num1.close();
    */


Scanner num2= new Scanner(System.in);
Byte b;
do {
    System.out.println("Enter positive number");
    while(!num2.hasNextByte())
    {
        String input =num2.next();
        System.out.printf("\"%s\" is not valid number.Please enter a valid \n",input);
    }
    b=num2.nextByte();

}while(b<0);
 b++;
System.out.println(b);
num2.close();

 
Scanner num3= new Scanner(System.in);
 Short sh;
do {
    System.out.println("Enter positive number");
    while(!num3.hasNextShort()){
        String input =num3.next();
        System.out.printf("\"%s\" is not valid number.Please enter a valid \n",input);
    }
    sh=num3.nextShort();

}while(sh<0);
 sh--;
System.out.println(sh);
num3.close();

    
 

Scanner num4= new Scanner(System.in);
Double d;
do {
    System.out.println("Enter positive number");
    while(!num4.hasNextDouble()){
        String input =num4.next();
        System.out.printf("\"%s\" is not valid number.Please enter a valid \n",input);
    }
    d=num4.nextDouble();

}while(d<0);
 d*=10;
System.out.println(d);
num4.close();

Scanner num5= new Scanner(System.in);   
    
Long l;
do {
    System.out.println("Enter positive number");
    while(!num5.hasNextLong()){
        String input =num5.next();
        System.out.printf("\"%s\" is not valid number.Please enter a valid \n",input);
    }
   l=num5.nextLong();

}while(l<0);
 l=l*100;
System.out.println(l);
num5.close();
}
}   


