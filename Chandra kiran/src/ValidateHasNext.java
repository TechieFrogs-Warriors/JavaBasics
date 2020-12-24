import java.math.BigInteger;
import java.util.Scanner;
public class ValidateHasNext {
    public static void main(String[] args) {
        String s=new String(" 6*(10)^-326 uyyb 90.78 80000000");
        
        Scanner num= new Scanner(s);
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
}
    }

float f;
do {
    System.out.println("Enter positive number");
    while(!num.hasNextFloat()){
        String input =num.next();
        System.out.printf("\"%s\" is not valid number.Please enter a valid \n",input);
    }
    f=num.nextFloat();

}while(f<0);
 f=f/2;
System.out.println(f);
    }
}*/

Byte b;
do {
    System.out.println("Enter positive number");
    while(!num.hasNextByte())
    {
        String input =num.next();
        System.out.printf("\"%s\" is not valid number.Please enter a valid \n",input);
    }
    b=num.nextByte();

}while(b<0);
 b++;
System.out.println(b);
    
    


    }
    
}

Short sh;
do {
    System.out.println("Enter positive number");
    while(!num.hasNextShort()){
        String input =num.next();
        System.out.printf("\"%s\" is not valid number.Please enter a valid \n",input);
    }
    sh=num.nextShort();

}while(sh<0);
 sh--;
System.out.println(sh);

    }
    
}
Double d;
do {
    System.out.println("Enter positive number");
    while(!num.hasNextDouble()){
        String input =num.next();
        System.out.printf("\"%s\" is not valid number.Please enter a valid \n",input);
    }
    d=num.nextDouble();

}while(d<0);
 d*=10;
System.out.println(d);

    }
    3
}

BigInteger Big;
do {
    System.out.println("Enter positive number");
    while(!num.hasNextBigInteger()){
        String input =num.next();
        System.out.printf("\"%s\" is not valid number.Please enter a valid \n",input);
    }
    Big=num.nextBigInteger();

}while();
 
System.out.println(Big);

    }
    
}
