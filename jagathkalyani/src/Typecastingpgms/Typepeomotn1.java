package Typecastingpgms;

public class Typepeomotn1 {
    public static void main(String[] args) {
         
           ///automatic Type Promotion in Expressions
           //implicit type
           byte a = 40;
           byte b = 50;
           byte c = 100;
           int d = a * b / c;
           int d1=d+b;
           int d2=d+b*2;
           int d3=d+b*2+c;   
           System.out.println("d :" + d);
           System.out.println("d1 :" +d1);
           System.out.println("d2 :"+d2);
           System.out.println("d3 :"+d3);////



              //
        
            //explicit type
            double d4 = 100.04;  
            long l4 = (long)d4;  ///Automatic promotions and compile-time error.......
            int i4 = l4+2*d4;  /////here we will get compile time error......to rectofy this we have to keep (int) infront of eqn...
            System.out.println(" value "+i4); 
             //////      
              
    }
    
}
