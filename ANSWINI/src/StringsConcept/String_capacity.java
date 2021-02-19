package StringsConcept;

public class String_capacity 
{
    public static void main(String[] args) 
    {
        StringBuffer b=new StringBuffer();
        System.out.println(b.capacity());
        b.append("hello how are you . iam fine");
        System.out.println(b.capacity());
        b.ensureCapacity(40);
        System.out.println(b.capacity());
        b.ensureCapacity(100);
        System.out.println(b.capacity());

        System.out.println();
        StringBuffer z=new StringBuffer();
        System.out.println(z.capacity());//default capacity is 16
        z.append("glad to meet you.iam so grat.");
        z.ensureCapacity(80);
        System.out.println(z.capacity());//capacity is showing 40
        z.ensureCapacity(100);
        
        System.out.println(z.capacity());//showing capacity 82
        System.out.println(z.length());
    }
    
}
