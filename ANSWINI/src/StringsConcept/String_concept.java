package StringsConcept;

public class String_concept 
{
    public String str="hello";
    public static void main(String[] args) 
    {
        String name="answini";//creating string by java string literal
        name=name.concat("hi");
        System.out.println(name);

        String myName="answini";
        //name=String surName="kannikanti";//can't change string value after once it is assigned
        String surName="kannikanti";
        String fullName=new String("Answini Kannikanti");//creating java string by new keyword
        String nickName=" ";
        char s[]={'A','N','S','W','I','N','I'};
        System.out.println(s);
        String s1=new String(s);//converting array to string
        String z="all the well is well in all the world always";
        
        //calculates LENGTH of string
        System.out.println(name.length());

        //CONCATING two strings
        System.out.println(name.concat(surName));
        System.out.println(name.concat(" the great"));
        String name1=name.concat(" the coder ");
        System.out.println(name1);
        name.concat(" the coder");//will not change String name because its not assigning 
        System.out.println(name);//to anything but itself
        System.out.println(name+10);

        //using "\"(backslash) to include quotes("",',\) inbetween final quotes of string
        System.out.println("My name is \"answini\"");

        //adding two strings with numeric values
        String x="10";
        String y="20";
        System.out.println(x+y);

        //different methods of string
        System.out.println(name1.trim());//trims spaces at start and end
        System.out.println(name.equals(name1));//compares only values to be same(case sensitive)
        System.out.println(name==myName);//compares value and address also to be same
        System.out.println(name.compareTo("ANSWINILEGEND"));//compares lexicographically
        System.out.println(name.compareToIgnoreCase("ANSWINILEGEND"));//ignores case
        System.out.println(name.equalsIgnoreCase("ANSWINI"));//ignores case sensitivity while comparing
        System.out.println(fullName.startsWith("a"));//checks for string starting match
        System.out.println(fullName.endsWith("I"));//checks for string ending match
        System.out.println(String.valueOf(s1));//checks value of object s1
        System.out.println(x.replace("10","30"));//replacing somepart of string with some other thing
        System.out.println(name.charAt(5));//character at that position in the string
        System.out.println(name.codePointAt(5));//returns unicode of character at that position
        System.out.println(name.codePointBefore(5));//returns unicode of character before that position
        System.out.println(name.codePointCount(2, 5));//returns unicode for characters between the positions
        System.out.println(name.contains("win"));//compare whether string contains something given
        System.out.println(name.indexOf("i"));//returns first occurence of i in the string
        System.out.println(nickName.isEmpty());//checks if string is empty not even having space in it
        System.out.println(nickName.isBlank());//checks presence of space also
        System.out.println(name.toUpperCase());//converts string to uppercase
        System.out.println(name.toLowerCase());//converts string to lowercase
        System.out.println(z.replaceAll("all", "none"));//replacing part of string with another throughout the expression
        System.out.println(name.replaceFirst("i", "@@"));//replaces first matching expr with second expression
        System.out.println(x.toString());//returns value of string object
        String s3=new String("4he1l5lo0");//splitting a string
        String[] s4 = s3.split("\\d");
        for(String f:s4)
        System.out.println(f);
        System.out.println(name.indexOf("i"));
        System.out.println(z.lastIndexOf("the"));//displays last occurence position  of given string
        System.out.println(z.lastIndexOf("the", 0));//displays last occurence of the given string till that position,if not there gives -1
        

        //SUBSTRING
        System.out.println(name.substring(3));//only starting position is given
        System.out.println(name.substring(3, 6));//start and end index is given
        byte r[]=name.getBytes();
        System.out.println(r);
        
        System.out.println(name.subSequence(1, 5));
        System.out.println(String.join("&", "in","is"));//joins given strings by using given delimiter(&)
        System.out.println(name.toCharArray());

    }
    
}
