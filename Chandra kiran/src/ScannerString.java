import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import org.graalvm.compiler.hotspot.replacements.BigIntegerSubstitutions;

public class ScannerString {
    public static void main(String[] args) 
        {
        String s= new String("30 40 west godavari eluru \n 543002 true 35 44473738 335346.847474");
        System.out.print("enter Address Details  ");
        Scanner m= new Scanner(s);
        
    
      Float doorno=m.nextFloat();
      double streetno=m.nextDouble();
      String District1 =m.next();
      String District2=m.next();
      String city =m.nextLine();
      int pincode =m.nextInt();
      Boolean status=m.nextBoolean();
      int distance=m.nextByte();
      BigInteger time=m.nextBigInteger();
      BigDecimal avgspeed=m.nextBigDecimal();
      
    if(doorno>0&&streetno%2==0){
        if(status==true){
      System.out.println("Door.No is:" +doorno);
      System.out.println("Street no is:" +streetno);
      System.out.println("District1:" +District1);
      System.out.println("District2:" +District2);
      System.out.println("city is :" +city);
      System.out.println("pincode is:" +pincode);
      System.out.println("status is:" +status);
      System.out.println("distance :" +distance);
      System.out.println("time taken: " +time);
      System.out.println("average speed:"+avgspeed);
      m.close();
     } }
    if(status==false)
    {
        System.out.println("Status is false: " +status);
    }
    
    else
    {
        System.out.println("INVALID ADDRESS");
     }
     
        
    
    
        
    }
    
}
