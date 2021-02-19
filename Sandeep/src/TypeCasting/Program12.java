package TypeCasting;

public class Program12 {
    public static void main(String[] args) {
        // String s = "336525335255";
        String s = "355";
        System.out.println("String value : " + s);
        int i = Integer.parseInt(s);// Converting String into int using Integer.parseInt()
        System.out.println("Integer value : " + i);

        float f = Float.parseFloat(s);// Converting String into float using Float.parseFloat()
        System.out.println("Float value : " + f);

        short sh = Short.parseShort(s);// Converting String to short using Short.parseShort()
        System.out.println("Short value : " + sh);

        long l = Long.parseLong(s);// converting String to Long using Long.parseLong()
        System.out.println("Long value : " + l);

        // char ch=Character.parse

    }

}
