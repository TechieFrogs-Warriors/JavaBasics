package Stringprograms;


public class Strass13 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("hello");
        sb.append("world");
        sb.append("string");
        System.out.println(sb);
        sb.setLength(0);
        sb.append("string deleted");
        System.out.println( sb);
        
    }
    
}
