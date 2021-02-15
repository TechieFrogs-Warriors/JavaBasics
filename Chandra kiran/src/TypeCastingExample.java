public class TypeCastingExample 
{
    public static void main(String[] args) 
    {
        byte a=100;
        short b=a;
        System.out.println("byte to short "+b);
        int c=b;
        System.out.println("short to int "+c);
        long d=c;
        System.out.println("int to long "+d);
        float e = d/3;
        System.out.println("long to float "+e);
        double f = e;
        System.out.println("float to double "+f); 
        int i=200;
        float g=i-70;
        System.out.println("int to Float "+g);
        double h=i+70.7;
        System.out.println("int to double "+h);
        char ch='c';
        int j=ch;
        System.out.println("char to Int "+j);
        f=ch;
        System.out.println("char to double "+f);

        
        
    }
    
}
