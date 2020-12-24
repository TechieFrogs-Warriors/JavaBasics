import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Inputscanner2 {
    public static void main(String[] args) {
        System.out.println("enter values:");
        Scanner new1=new Scanner(System.in);
        //String f=new1.nextLine();
        //int a=new1.nextInt();
        //short b=new1.nextShort();
        long c=new1.nextLong();
       // float d=new1.nextFloat();
        //double e=new1.nextDouble();
        //byte h=new1.nextByte();
        //boolean i=new1.hasNext();
        BigInteger j=new1.nextBigInteger();
        //BigDecimal k=new1.nextBigDecimal();
        //char l=new1.next().charAt(0);
        System.out.println("output  :");
        //System.out.println(a);
        //System.out.println(b);
        System.out.println(c);
        //System.out.println(d);
        //System.out.println(e);
        //System.out.println(f);
        //System.out.println(h);
        //System.out.println(i);
        System.out.println(j);
        //System.out.println(k);
        //System.out.println(l);
        new1.close();



        
    }
    
}
