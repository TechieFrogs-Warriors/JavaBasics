package Typecastingpgms;

public class Weidcast1 {
    public static void main(String[] args) {
        //Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double

        //
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0  //////
          //
        // create int type variable
        int num = 10;
        System.out.println("The integer value: " + num);

          // convert into double type
        double data = num;
        System.out.println("The double value: " + data);  ///////
          
           ///
        int i = 100;  
          // automatic type conversion 
        long l = i;  
             // automatic type conversion 
        float f = l;  
        System.out.println("Int value "+i); 
        System.out.println("Long value "+l); 
        System.out.println("Float value "+f);   ////
         



        
    }
    
}
