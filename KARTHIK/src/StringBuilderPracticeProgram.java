public class StringBuilderPracticeProgram {
    public StringBuilder str1=new StringBuilder("Sample Program");
    public StringBuilder str2=new StringBuilder("Test Program");
    public static void main(String[] args) {
        StringBuilderPracticeProgram obj=new StringBuilderPracticeProgram();
        System.out.println("append");
        System.out.println(obj.str1.append(" on StringBuilder"));//append
        System.out.println(obj.str2.append(" On StringBuilder"));
        System.out.println(obj.str1.append('g'));

        System.out.println("Length:");
        System.out.println(obj.str1.length());//length of the string
        System.out.println(obj.str2.length());

        System.out.println("capacity:");
        System.out.println(obj.str1.capacity());//capacity
        System.out.println(obj.str2.capacity());
        obj.str1.ensureCapacity(72);//ensureCapacity
        System.out.println(obj.str1.capacity());

        System.out.println("insert:");
        System.out.println(obj.str1.insert(2, "simp"));//insert
        System.out.println(obj.str1.insert(2, "simp", 0, 4));//insert offset string start end
        System.out.println(obj.str1.insert(2, 'g'));//insert oofset char
        System.out.println(obj.str1.insert(2, obj.str2));//insert offeset object

        System.out.println("replace:");
        System.out.println(obj.str1.replace(15, 18, "gym"));//replace

        StringBuilder str3=new StringBuilder("Test Program");
        System.out.println("reverse: ");
        System.out.println(str3.reverse());//reverse

        System.out.println("delete: ");
        System.out.println(str3.delete(0,3));//delete
        System.out.println(str3.deleteCharAt(5));

        System.out.println("substring:");
        System.out.println(str3.substring(5));//subString Start index
        System.out.println(str3.substring(5, str3.length()));//subString Start And End Index

        System.out.println("subSequence:");
        System.out.println(str3.subSequence(5, str3.length()));//subSequence start end

        System.out.println("trimToSize:");
        str3.trimToSize();
        System.out.println(str3);

        System.out.println("toCharArray: ");
        String Str4="karthik";//to char array
        char[] ch=Str4.toCharArray();
        System.out.println(ch);
       for(int i=0;i<=ch.length;i++){
            System.out.println(ch[i]);
        }
    }
    
}
