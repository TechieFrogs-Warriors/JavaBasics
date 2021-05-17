package ProgramizExamplePrograms;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String sentence = "Sai Venkata Krishna Sandeep";

        System.out.println("Original scentence is :: " + sentence);

        sentence = sentence.replaceAll(" ", "");

        System.out.println("\nAfter removing All White Spaces is :: " + sentence);
    }

}
