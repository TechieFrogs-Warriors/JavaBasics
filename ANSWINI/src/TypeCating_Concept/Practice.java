package TypeCating_Concept;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice 
{
    public static void main(String[] args) throws ParseException 
    {
        System.out.println("...........Different TypeCasting...........\n");

        /* Explicit TypeCasting (OR) Narrowing */

       // byte num=129;//throws error because byte cant hold integer value
       //so we have to convert integer to byte explicitly here.
       byte num = (byte)129;
       System.out.println("Explicitly converted byte value is: "+num);

      // int num1 = 12.5;//double is gretaer than int..so integer cant hold double value...throws error
      int num1 = (int)12.5;
      System.out.println("Explicitly converted integer value is: "+num1);

      //float num2 = 12.255454544558754555;cannot convert double to float
      float num2 = (float) 12.255454544558754555;
      System.out.println("Explicitly converted float value is: "+num2);


      /* Implicit Typecasting (OR) Widening */

      short num3 = 127;//since 127 is byte value which is smaller than short...implicit casting takes place
      long num4 = num3;//short is smaller than long..no need to convert explicitly
      double num5 = num4;//long is smaller than double ...implicit casting.
      int num6 = '2';
      System.out.println("Implicitly converted values: "+num3+"\n"+num4+"\n"+num5+"\n"+num6);

      System.out.println("\n..........Type Promotions............");
      /*  coverting from primitive datatypes to non-primitive datatypes */

     // int number = "105";//throws error because the datatypes are not compatible
     //Type promotion should be done in such cases as follows :

     System.out.println("\n..........String to int and vice versa............\n");

     //string to int AND int to string conversion
     String number="100";
     int i=Integer.parseInt(number);//converting string to integer
     int j=Integer.valueOf(number);//converting string to integer
     System.out.println("After conversion from string to integer : "+i+" "+j);

     int number1 = 200;
     //String s=number1;//type mismatch
     String str =Integer.toString(number1);//converted from integer to string
     String str1 = String.valueOf(number1);//converted from integer to string
     String str2 = String.format("%d", number1);//another method used to convert from integer to string
     System.out.println("After conversion from integer to string: "+str+" "+str1+" "+str2);

     System.out.println("\n..........String to long and vice versa............\n");

     //convert String to long  AND convert long to String 
     String st = "2507854455";
     //long l=st;//type mismatch error
     long l = Long.parseLong(st);//converted from string to long
     long lo = Long.valueOf(st);//converted from string to long
     System.out.println("String to long conversion: "+l+" "+lo);

     
     long lon = 24545124544545l;
     //String s1 = lon;//type mismatch error
     String s1=String.valueOf(lon);//converted from long to string
     String s2=String.format("%s", lon);//converted from long to string
     String ss=Long.toString(lon);//converted from long to string
     System.out.println("long to string conversion: "+s1+" "+s2+" "+ss);

     System.out.println("\n..........String to float and vice versa............\n");

     //convert String to float AND convert  float to String 
     String s6="12.5";
     //float f1=s6;//Type mismatch error
     float f1=Float.parseFloat(s6);//converted from string to float
     float f2=Float.valueOf(s6);//converted from string to float
     System.out.println("String to float conversion: "+f1+" "+f2);

     float f=12.5f;
     //String s3=f;//Type mismatch error occurs
     String s3=String.valueOf(f);//converted from float to string
     String s4=String.format("%s", f);//converted from float to string
     String s5=Float.toString(f);//converted from float to string
     System.out.println("float to string conversion: "+s3+" "+s4+" "+s5);

     System.out.println("\n..........String to double and vice versa............\n");

     //convert String to double AND convert double to String 
     String s7="12.555555555555";
     //double d=s7;//Type mismatch error
     double d=Double.parseDouble(s7);//converted from string to double
     double d1=Double.valueOf(s7);//converted from string to double
     System.out.println("String to double conversion: "+d+" "+d1);

     double dl=12.55555555555555;
     //String s8=d1;//Type mismatch error
     String s8=String.valueOf(d1);//converted from double to string
     String s9=String.format("%f", d1);//converted from double to string
     String s10=Double.toString(d1);//converted from double to string
     System.out.println("double to string values: "+s8+" "+s9+" "+s10);

     System.out.println("\n..........String to Date and vice versa............\n");

     //convert String to Date AND convert Date to String 
     String dat="12/06/2021";
     //Date date=dat;//Type mismatch error
     Date date=new SimpleDateFormat("dd/MM/yyyy").parse(dat);//string converted to date
     System.out.println("String to date conversion: "+date);

     Date date1 = Calendar.getInstance().getTime();  
     DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
     String strDate = dateFormat.format(date1); //date convertedto string
     System.out.println("Date to string conversion: "+strDate);

     System.out.println("\n..........String to character and vice versa............\n");

     //convert String to char AND convert char to String
     String s11="chair";
     //char ch=s11;//Type mismatch error
     char ch=s11.charAt(0);//converting string to char
     System.out.println("string to character: "+ch);
     
     char c='A';
     //String s12=c;//Type mismatch error
     String s12=Character.toString(c);//converting char to string
     String s13=String.valueOf(c);//converting char to string
     System.out.println("character to string: "+s12+" "+s13);

     System.out.println("\n..........String to object and vice versa............\n");

     //convert String to Object AND convert Object to String 

     //converting string to object
     String so="Aswini";  
     Object obj=so; //converted 
     System.out.println("String converted to object: "+obj); 

     //converting object to string
     String os="Aswini";  
     StringBuilder sb=new StringBuilder(os);  
     sb.reverse();  
     String rev=sb.toString();//converting StringBuilder to String  
     System.out.println("object converted to String : "+os);  
     System.out.println("Reverse String is: "+rev);  

     //scenarios
     int a=9;
     float b=a/2;//a/2f gives correct output
     System.out.println(b);//prints 4.0 (but should print 4.5,should keep 'f' to typecast(a/2f)

     byte by = 25;
     by ++;
     // by = by + 1;//throws type mismatch error,explicitly typecasting should be done for expressions
     System.out.println(by);//because expressions give integer value as output

     int value = 260;
     byte bValue = (byte)a;
     System.out.println(bValue);
     //prints 4 as output.will do modulus with highest possible number in that datatype(260%256=4)
     //That big number is Modulo Divided by the 
     //target data type highest possible number say 2^N and the Remainder is taken

     boolean bool=true;
     // int boolValue=bool;//boolean values cannot be typecasted

     
        byte x=3;
        int z=x;
        short m=3333;
        z=m;
        
        z=4365;
        long n=z;

        double h=32.4/2;
        System.out.println(h);
        //String s15="3275197531756";
       // int v=Integer.parseInt(s15);//number format exception occurs

      // int a1=10.5;
       //String str11=Integer.toString(a1);
       //System.out.println(str1);
        
        
    }
    
}
