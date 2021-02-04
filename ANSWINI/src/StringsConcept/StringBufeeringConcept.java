package StringsConcept;

public class StringBufeeringConcept 
{
    public static void strConcat(String str1) 
    { 
        str1 = str1 + "Answini"; 
    } 
   
    public static void strBufConcat(StringBuffer str2) 
    { 
        str2.append("Achyuth is a goood boy but lttle naughty"); //adding this sting to stringbuffer string
    } 
   
    public static void strBuildConcat(StringBuilder str3) 
    { 
        str3.append("vedansh"); //adding this sting to stringbuilder string
    }
    public static void strBufDelete(StringBuffer str2) 
    {
        str2.delete(2, 7);//start and end index to delete part of string
        
    }
    public static void strBuildDelete(StringBuilder str3) 
    {
        str3.delete(5, str3.length());// start and end index to delete part of string
        
    } 
    public static void strBufReverse(StringBuffer str2)
    {
        str2.reverse();
    }
    public static void strBuildReverse(StringBuilder str3)
    {
        str3.reverse();
    }
    public static void strBufInsert(StringBuffer str2)
    {
        str2.insert(1, "hello");
    }
    public static void strBuildInsert(StringBuilder str3)
    {
        str3.insert(3, "hello");
    }
    public String toString()
    {
        return "hello how are you...iam fine....thankyou";
    }
    public static void strBufReplace(StringBuffer str4)
    {
        str4.replace(2,str4.length(), "dam");
    }

     
   
    public static void main(String[] args) 
    { 
        String str1 = "Hello Answini!"; 
        strConcat(str1); 
        System.out.println("The final String is - " + str1); 
        StringBuffer str2 = new StringBuffer("Hello Bufferer!"); 
        strBufConcat(str2); 
        System.out.println("The final String after concating is - " + str2);
        strBufDelete(str2);
        System.out.println("The final String after deleting is - " + str2);
        strBufReverse(str2);
        System.out.println("The final String after reversing is - " + str2);
        strBufInsert(str2);
        System.out.println("The final String after inserting is - " + str2);
        StringBuffer str4=new StringBuffer("mam");
        strBufReplace(str4);
        System.out.println("The final string after replacing is - "+str4);
        System.out.println(str2.capacity());

        StringBuffer s1=new StringBuffer();
        System.out.println(s1.capacity());//default capacity is 16
        s1.append("glad to meet you.iam so grateful to you.");
        System.out.println(s1.capacity());//capacity is showing 40
        s1.ensureCapacity(80);
        System.out.println(s1.capacity());//showing capacity 82
        

        
        StringBuilder str3 = new StringBuilder("Hello Builder!"); 
        strBuildConcat(str3);
        System.out.println("The final String after concating is -" + str3); 
        strBuildDelete(str3);
        System.out.println("The final String after deleting is -" + str3);
        strBuildReverse(str3);
        System.out.println("The final String after reversing is -" + str3);
        strBuildInsert(str3);
        System.out.println("The final String after inserting is -" + str3);
        System.out.println(str3.capacity());
        

        StringBufeeringConcept st=new StringBufeeringConcept();
        System.out.println(st.toString());
        System.out.println(st.hashCode());
        String str6="hellobye";
        System.out.println(str6.getBytes());
        
    } 
} 
    

