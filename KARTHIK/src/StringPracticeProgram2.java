public class StringPracticeProgram2 {
    public String Str10="Strings Are Immutable";
    public String Str11="Strings Are Immutable";
    public String Str13="Integers Are not Immutable";
    
    public static void main(String[] args) {
        
        String str1="Testprogram";//substring
        System.out.println(str1.substring(4));
        System.out.println(str1.substring(2, 8));
        System.out.println(str1.toUpperCase());
        
        String str2="simple program";//toUpperCase
        System.out.println(str2.toUpperCase());
        
        String str3="SIMPLE PROGRAM";//tolowercase
        System.out.println(str3.toLowerCase());

        String str4="        TEST     ";//trim
        System.out.println(str4.trim());

        String str5="Test program";//startWith and endWith
        System.out.println(str5.startsWith("Te"));
        System.out.println(str5.endsWith("gr"));

        String str6=new String("MYPROGRAM");//charAt
        System.out.println(str6.charAt(5));
        System.out.println(str6.charAt(6)+str6.charAt(7)+str6.charAt(8));

        String Str7=String.valueOf(1000);//valueOf
        int v=111;
        System.out.println(v+Str7);

        System.out.println(Str7.isEmpty());//isEmpty

        String Str8="Ram and sam are brothers.Ram is bigger than sam";
        System.out.println(Str8.replace("Ram","Ravi"));

        String str8="Amstrongprogram";//codePointAt
        System.out.println(str8.codePointAt(0));

        System.out.println(str8.codePointBefore(1));//codePointBefore

        System.out.println(str8.codePointCount(5, 15));//codePointCount

        System.out.println(str8.contains("pro"));//contains

        System.out.println(str8.contentEquals("Ams"));//contentEquals

        char[] str9={'h','e','l','l','o'};//copyValueOf
        String str10="";
        str10=str10.copyValueOf(str9, 0, 5);
        System.out.println(str10);

        System.out.println(str8.indexOf('a'));//indexOf
        System.out.println(str8.lastIndexOf('m'));

        StringPracticeProgram2 obj=new StringPracticeProgram2();//compareToIgnorenceCase
        System.out.println(obj.Str10.compareToIgnoreCase(obj.Str11));
        System.err.println(obj.Str11.compareToIgnoreCase(obj.Str13));
        System.out.println(obj.Str10.compareTo(obj.Str11));
        System.out.println(obj.Str11.compareTo(obj.Str13));

        System.out.println(obj.Str10.getBytes());//getByte it returns ASCII code
        
        System.out.println(obj.Str13.hashCode());//hashCode

        System.out.println(String.join(":", "My", "name", "is", "karthik"));//join
        System.out.println(obj.Str13.join(":", "My", "name", "is", "karthik"));
        
        System.out.println(obj.Str10.matches(obj.Str11));//matches
        System.out.println(obj.Str10.regionMatches(true, 0, obj.Str11, 0, 0));

        for(String Retval:obj.Str10.split(" ")){      //split 
            System.out.println(Retval);
        }

        System.out.println(obj.Str10.subSequence(0, 11));//Subsequence
        System.out.println(obj.Str10.substring(11));//subSequence


    }
    
}
