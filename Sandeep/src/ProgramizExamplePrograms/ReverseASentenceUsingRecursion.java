package ProgramizExamplePrograms;

public class ReverseASentenceUsingRecursion {
    public static void main(String[] args) {
        String sentence = "Iam Sandeep";

        String reverse = reverse(sentence);

        System.out.println("The reverce scentence is :: " + reverse);
    }

    public static String reverse(String sentence) {
        if (sentence.isEmpty()) {
            return sentence;
        }
        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }

}
