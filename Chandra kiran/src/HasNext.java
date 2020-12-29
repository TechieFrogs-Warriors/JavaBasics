

import java.util.Scanner;

import javax.xml.crypto.dsig.Manifest;

public class HasNext {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);

        
    
      int m=n.nextInt();
      int sum=n.nextInt();
      int mul=n.nextInt();
      int sub=n.nextInt(),div=n.nextInt();
      
  
  
    
 if(n.hasNextInt())
{ 
  sum+=m;
  System.out.println( "sum :" +sum);
}
      
      if(n.hasNextFloat())
      {
        mul*=m;
        System.out.println("mul:" +mul);
      }
      System.out.println(n.hasNextByte());
      if(n.hasNextByte()){
        sub-=m;
      System.out.println("sub :" +sub);
      

      }
      System.out.println(n.has);
      if(n.hasNextDouble()){
       div/=m;
      
    System.out.println("div :" +div);
      }
      n.close();

    }
    
    
}
