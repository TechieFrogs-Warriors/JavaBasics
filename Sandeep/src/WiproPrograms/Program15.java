package WiproPrograms;

import java.util.*;

public class Program15 {
    public static String s1;

    public static String inputValidation(Scanner sc) {
        do {
            System.out.println("Enetr String: ");
            while (!sc.hasNext("[A-Za-z]*")) {
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            s1 = sc.nextLine();
        } while (s1.equals(""));
        System.out.println("Enter  String Is valid ");
        return s1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        s1 = inputValidation(sc);
        s1 = s1.toLowerCase();

        String[] words = s1.split(" ");// to split words in a string based on space
        boolean[] arr = new boolean[words.length];// to avoid checking the repeated word more than once
        int i, j;
        int count = 0;
        for (i = 0; i < words.length; i++) {// loop to compare from the start element
            if (!arr[i]) // checks whether the word is already checked or not.
            {
                count++;// cont incremts for the number of words
                for (j = i + 1; j < words.length; j++) {// loop to compare withthe ith elemnet
                    if (words[j].compareTo(words[i]) == 0) {// if equal returns true
                        arr[j] = true;
                        count--;// cont is decremented when the same number of words anre printed
                    }
                }
            }
        }
        System.out.println("number of non repated words are :: " + count);

    }

}
