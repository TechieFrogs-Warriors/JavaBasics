public class StringPracticeProgram {
    public static void main(String[] args) {
        String str1="Simple";
        String str2="Simple";
        System.out.println(str2);
        
        str1.concat("program");//cant add because string is immutable  
        System.out.println(str1);
        
        str1=str1.concat(str2);//concat
        System.out.println(str1);
        System.out.println(str1.concat("program"));
        
        String str3=new String("Simple");//compare using ==
        System.out.println(str1==str3);//it also compare references
        System.out.println(str1.equals(str3));//it compare only the string not instences
        
        String str4="Program";//compare
        System.out.println("******compare*****");
        System.out.println(str1.compareTo(str4));
        System.out.println(str1.compareToIgnoreCase("sIMPLE"));

        String str5=str3.intern();//intern
        System.out.println(str2==str5);
    }
} 
