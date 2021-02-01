public class StringBufferExample 
{
   public static void main(String args[]) 
    {
        StringBuffer Sb = new StringBuffer("Chandra");
        Sb.append("Kiran");
        Sb.append(6);
        Sb.append('R');
        Sb.append(34.0);
        Sb.append('h');
        System.out.println("Append "+Sb);
        StringBuffer Sb1 = new StringBuffer("Chandra");
        Sb1.insert(3, "kiran");
        Sb1.insert(8, "chandu");
        System.out.println("Insert "+Sb1);
        StringBuffer Sb2 = new StringBuffer("chandra");
        Sb2.replace(2, 5, "Chandu");
        Sb2.replace(0, 7, "chandrakiran");
        System.out.println("Replace "+Sb2);
        StringBuffer Sb3 = new StringBuffer("chandrakiran");
        Sb3.delete(0, 3);
        Sb3.deleteCharAt(3);
        System.out.println("Delete "+Sb3);
        StringBuffer Sb4 = new StringBuffer("Chandu");
        System.out.println("Reverse "+Sb4.reverse());
        StringBuffer Sb5 = new StringBuffer();
        System.out.println("String Capacity "+Sb5.capacity());
        Sb5.append("My name is chandra kiran");
        System.out.println("After String Capacity "+Sb5.capacity());
        Sb5.ensureCapacity(10);
        System.out.println("Ensure Capacity  less "+Sb5.capacity());
        Sb5.ensureCapacity(50);
        System.out.println("Ensure Capacity more "+Sb5.capacity());
        StringBuffer Sb6 = new StringBuffer("CHANDRA KIRAN");
        System.out.println("Char At "+Sb6.charAt(9));
        System.out.println("Sub String At Index "+Sb6.substring(5));
        System.out.println("Sub String Start End "+Sb6.substring(8, 13));
        System.out.println("length "+Sb6.length());
        System.out.println("Code At point "+Sb6.codePointAt(10));
        System.out.println("Code At Before "+Sb6.codePointBefore(3));
        System.out.println("Code Count "+Sb6.codePointCount(2, 10));
        System.out.println(Sb6.codePoints());
        System.out.println(Sb==Sb1);
        System.out.println(Sb.equals(Sb1));
        
    }
    
}
