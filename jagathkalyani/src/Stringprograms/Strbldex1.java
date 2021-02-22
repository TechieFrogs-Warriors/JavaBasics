package Stringprograms;

public class Strbldex1 {
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder("warriors ready to fight");
        System.out.println(str);
        str.append('c');
        System.out.println("after appending = "  + str);
        str=new StringBuilder("hello");
        System.out.println(str);
        str.append('#');
        System.out.println("after appending = "  + str);

    }
    
}
