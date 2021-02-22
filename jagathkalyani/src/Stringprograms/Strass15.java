package Stringprograms;

public class Strass15 {
    public static void main(String[] args) {
        String name="warriors";
        String firstletter=name.substring(0,1);
        String remainingletters=name.substring(1, name.length());
        firstletter=firstletter.toUpperCase();
        name=firstletter+remainingletters;
        System.out.println("name : " + name);
    }
    
}
