package Typecastingpgms;

public class conversions1 {
    public static void main(String[] args) {
        //int to string
        //creating int type variable
        int num = 10;
        System.out.println("The integer value is: " + num);

        // converts int to string type
        String data = Integer.toString (num);//   we can also use String.format()   String.valueOf()
        System.out.println("The string value is: " + data);//////
        //str to int
        // create string type variable
        String data1 = "10";
         System.out.println("The string value is: " + data1);
        // convert string variable to int
        int num1 = Integer.parseInt(data1);// we can also use Integer.valueOf() 
        System.out.println("The integer value is: " + num1);//////
             //str to long
        //creating str type variable
        String data2 = "10";
        System.out.println("The string value is: " + data2);
        long l2 = Long.parseLong(data2);
        System.out.println("The long value is: " + l2);//////
           //long to str
           //creating long type variable
        long data3 = 9225;
        System.out.println("The long value is: " + data3);
        String str3 =String.valueOf(data3);///we can also use  Long.toString()
        System.out.println("The string is: " + str3);//////
           //str to float
        //creating str type variable
        String data4 = "555555";
        System.out.println("The string value is: " + data4);
        float f4 = Float.parseFloat(data4);
        System.out.println("The float value is: " + f4);//////
           //float to str
           //creating float type variable
        float data5 = 5555555;
        System.out.println("The float value is: " + data5);
        String str5 =String.valueOf(data5);///we can also use  Float.toString() 
        System.out.println("The string is: " + str5);//////
           //str to double
        //creating str type variable
        String data6 = "555555.55";
        System.out.println("The string value is: " + data6);
        double d6 = Double.parseDouble(data6);
        System.out.println("The double value is: " + d6);//////
           //double to str
           //creating float type variable
        double data7 = 55555.55;
        System.out.println("The double value is: " + data7);
        String str7 =String.valueOf(data7);///we can also use  double.toString() 
        System.out.println("The string is: " + str7);//////
        
        

    }
    
}
