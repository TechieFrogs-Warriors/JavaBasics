package Stringprograms;

public class Strass12 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("hello");
        sb.append("world");
        sb.append("string");
        sb.delete(0, sb.length());
        sb.append("string deleted");
        System.out.println( sb.toString());
    }
    
}
