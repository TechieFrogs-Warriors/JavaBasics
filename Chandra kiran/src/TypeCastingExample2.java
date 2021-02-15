public class TypeCastingExample2 
{
    public static void main(String[] args) 
    {
        String S ="2021";
        int i=Integer.parseInt(S);
        System.out.println("String to Integer "+i);
        S=String.valueOf(i);
        System.out.println("Integer to String "+S+200);
        S=Integer.toString(i);
        System.out.println("Int to String "+S);
        S=String.format("%d", i);
        System.out.println("Format "+S);
        String S1="24364747858";
        long l=Long.parseLong(S1);
        System.out.println("String to Long "+l);
        S1=Long.toString(l);
        System.out.println("Long to String "+S1+300);
        String S2="5664774";
        float f= (float) (Float.parseFloat(S2) + 10.2);
        System.out.println("String to Float "+f);
        S1=Float.toString(f);
        System.out.println("Float to String "+S1);
        double d=6575758.867;
        S1=Double.toString(d);
        System.out.println("Double to String "+S1);
        d=Double.parseDouble(S2)+700.30;
        System.out.println("String to Double "+d);
        S2=Double.toHexString(d);
        System.out.println("Hexa String "+S2);
        
     }
    
}
