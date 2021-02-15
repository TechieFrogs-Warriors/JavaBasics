package JavaAdvancedPractice;

public class Excerises7 {
    public static void main(String[] args) {
        String arr = "The quick brown fox jumps over the lazy dog.";
        char ch[] = arr.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i] + " index value " + i);
        }
    }

}
