package WiproPrograms.WiproCooding2;

import java.util.*;

public class Program8 {
    // valiation method for input String
    public static String inputValiadtionS(Scanner sc) {
        String word;
        do {
            System.out.println("Enetr String: ");
            while (!sc.hasNext("[A-Za-z]*")) {
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            word = sc.nextLine();
        } while (word.equals(""));
        return word;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // intilizing the string input
        String word = inputValiadtionS(sc);// input validation

        // converting string to charcter array
        char ch[] = word.toCharArray();

        int max;// itilizing the max value

        int frequncy[] = new int[word.length()];// intilizing the ferquency array
        char maxchar = word.charAt(0);

        // counting the each word in a string to stoe in th efrequency array
        for (int i = 0; i < ch.length; i++) {
            frequncy[i] = 1;// intilay the value is 1
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j] && ch[i] != ' ' && ch[i] != '0')// if the same value and not 0 and space than
                                                                   // frequncy is stored and incremented
                {
                    frequncy[i]++;

                    frequncy[j] = '0';// to avoid printing th evisited characted
                }
            }
        }

        // code for the maximum occurance character
        max = frequncy[0];
        for (int i = 0; i < frequncy.length; i++) {
            if (max < frequncy[i]) {
                max = frequncy[i];// if max is less tthen assign the frequency value to the max

                maxchar = ch[i];// the char index vale to th emax char print the output at the last
            }
        }
        System.out.println(maxchar);

    }
}
