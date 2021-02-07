package StringsConcept;

public class Program12_13_14 
{
    public static void main(String[] args) 
    {   
        //program12 using delete() method
        System.out.println("program12");
        //creating a string in stringbuffer
        StringBuffer st=new StringBuffer("hello team");
        System.out.println(st);
        System.out.println(".............................");
        //clearing stringbuffer 
        System.out.println(st.delete(0,st.length()));

        //program13 using setlength() method
        System.out.println("program13");
        //creating a string in stringbuffer
        StringBuffer st1=new StringBuffer("hello techie team");
        System.out.println(st1);
        System.out.println(".............................");
        //clearing stringbuffer 
        st1.setLength(0);
        System.out.println(st1);

        //program14 by creating new object
        System.out.println("praogram14");
        //creating a string in stringbuffer
        StringBuffer st2=new StringBuffer("hello techie java team");
        System.out.println(st2);
        System.out.println(".............................");
        //clearing stringbuffer 
        st2=new StringBuffer();//creating new object
        System.out.println(st2);

        
        
    }
    
}
