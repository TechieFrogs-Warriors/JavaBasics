public class StringBuilderExample 
{
    public static void main(String[] args) 
    {
        StringBuilder Sb = new StringBuilder("Chandra");
        System.out.println("Append "+Sb.append("Kiran"));
        StringBuilder Sb1 = new StringBuilder("Chandra");
        Sb1.insert(3, "kiran");
        Sb1.insert(8, "chandu");
        System.out.println("Insert "+Sb1);
        StringBuilder Sb2 = new StringBuilder("chandra");
        Sb2.replace(2, 5, "Chandu");
        Sb2.replace(0, 7, "chandrakiran");
        System.out.println("Replace "+Sb2);
        StringBuilder Sb3 = new StringBuilder("chandrakiran");
        Sb3.delete(0, 3);
        Sb3.deleteCharAt(3);
        System.out.println("Delete "+Sb3);
        StringBuilder Sb4 = new StringBuilder("Chandu");
        System.out.println("Reverse "+Sb4.reverse());
        StringBuilder Sb5 = new StringBuilder();
        System.out.println("String Capacity "+Sb5.capacity());
        Sb5.append("My name is chandra kiran");
        System.out.println("After String Capacity "+Sb5.capacity());
        Sb5.ensureCapacity(10);
        System.out.println("Ensure Capacity  less "+Sb5.capacity());
        Sb5.ensureCapacity(50);
        System.out.println("Ensure Capacity more "+Sb5.capacity());
        StringBuilder Sb6 = new StringBuilder("CHANDRA KIRAN");
        System.out.println("Char At "+Sb6.charAt(9));
        System.out.println("Sub String At Index "+Sb6.substring(5));
        System.out.println("Sub String Start End "+Sb6.substring(8, 13));
        System.out.println("length "+Sb6.length());
        System.out.println("Code At point "+Sb6.codePointAt(10));
        System.out.println("Code At Before "+Sb6.codePointBefore(3));
        System.out.println("Code Count "+Sb6.codePointCount(2, 10));
        System.out.println(Sb6.indexOf("A",9));
        System.out.println(Sb6.isEmpty());
        System.out.println(Sb6.subSequence(5, 9));
        

    }
    
}
