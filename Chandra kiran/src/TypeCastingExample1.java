public class TypeCastingExample1 
{
    public static void main(String[] args) 
    {
        double a=50.76;
        System.out.println("Double "+a);
        float b= (float)a;
        System.out.println("Double to Float "+b);
        long c =(long)b+800;
        System.out.println("Float to Long "+c);
        int d=(int)c;
        System.out.println("Long to int "+d);
        short e = (short)d;
        System.out.println("int to Short "+e);
        byte f = (byte)e;
        System.out.println("short to byte "+f);
        int i=70;
        char ch=(char) i ;
        System.out.println("int to char "+ch);
        int j=(int)a+100;
        System.out.println("Double to int "+j);


        
    }
    
}
