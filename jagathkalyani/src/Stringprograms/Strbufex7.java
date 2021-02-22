package Stringprograms;

public class Strbufex7 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        System.out.println("before ensure capacity " + str.capacity());
        str.ensureCapacity(18);
        System.out.println(" ensure capacity " + str.capacity());




        StringBuffer str1 = new StringBuffer("warriors ready to fight");
        System.out.println("before ensure capacity " + str1.capacity());
        str1.ensureCapacity(48);
        System.out.println(" ensure capacity " + str1.capacity());
    }
    
}
