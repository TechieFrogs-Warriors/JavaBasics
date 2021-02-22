package Typecastingpgms;

public class Narrowcast1 {
    public static void main(String[] args) {
        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int -> char -> short -> byte
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9


               //
         // create double type variable
        double num = 10.99;
        System.out.println("The double value: " + num);

        // convert into int type
        int data = (int)num;
        System.out.println("The integer value: " + data);//

             //
       // int i = 40;
        //char ch = (char) i;
       // System.out.println("Character value of the given integer: "+ch);//
             
           //pgm without using manual casting....
        double num1 = 10;
        System.out.println("The double value: " + num1);
   
         // convert into double type
        //int data1 = num1;   ///////can't convert  from double to int......to rectify that we hav to usee manual casting....
                             ///here we are converting double to int we hav to use (int) 
        //System.out.println("The integer value: " + data1);//


           //
        //char ch = 'c'; 
        //int num2 = 88; 
        //ch = num2;     /////can't convert int to char bcz didn't use manual casting
        //System.out.println("The character : " + ch);//////



            //
        double d = 100.04;  
          
            //explicit type casting 
        long l = (long)d; 
              
            //explicit type casting  
        int i = (int)l;  
        System.out.println("Double value "+d); 
        System.out.println("Long value "+l);  
        System.out.println("Int value "+i);     //////


             //
        byte b1;  
        int i1 = 257;  
        double d1 = 323.142; 
        System.out.println("Conversion of int to byte.");  
        b1 = (byte) i1;  
        System.out.println("i = " + i1 + " b = " + b1); 
        System.out.println("\nConversion of double to byte."); 
        b1 = (byte) d1;  
        System.out.println("d = " + d1 + " b= " + b1);//      

   

             

    }
    
}
