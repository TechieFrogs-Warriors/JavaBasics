package Stringprograms;

public class Strass31 {
    public static void main(String[] args) {
        String str="warrirors ready t     o fight";
        System.out.println(" before : " + str);
        str=str.replaceAll("\\s","");
        System.out.println("after : " + str);
    }
    
}
