public class TypeCasting {
    public static void main(String[] args) {
        int a=100;
        float b=90;
        long l=484984984;
        //byte=float *int
        byte b1=(byte)(a*b);
        System.out.println("Explicit Byte Value is:"+b1);//which gives 9000%256=40;

        //int =float  * int
        int i=(int)(a*b);
        System.out.println("Explicit int Value is: "+i);

        //int =float *int  (result is exceed value to int)
        float a1=990000000;
        int i1=(int)(a1*a);//actual answer is 99000000512  but it shows only last value of int
        System.out.println("Explicit int conversion value is: "+i1);//output 2147483647

        //double=long * float
        double d1=l*b;
        System.out.println("Double value is:"+d1);

        float b2=l*b;
        System.out.println("Float value:"+b2);

        long l2=(long)(l*b);
        System.out.println("Long value :"+l2);

        int i3=(int)(l*b);
        System.out.println("int value :"+i3);
        
        short s3=(short)(l*b);
        System.out.println("Short value:"+s3);

        byte y1=(byte)(l*b);
        System.out.println("Byte Value:"+y1);  
        
        //char and byte to char
        char ch='E';
        byte e=6;
        char ch1=(char)(ch+e);
        System.out.println("Char and byte value :"+ch1);//output:  K

        //same char and byte to byte;
        byte b3=(byte)(e+ch);
        System.out.println("Byte and char value in byte: "+b3);//output : 75

        //double and short
        double c=89;
        short d=89;
        //short =short*double;
        short sh=(short)(c*d);
        System.out.println("Short and double in short is: "+sh);


    }
}
