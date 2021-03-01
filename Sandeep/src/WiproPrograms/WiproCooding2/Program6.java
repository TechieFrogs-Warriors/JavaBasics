package WiproPrograms.WiproCooding2;

import java.util.*;

public class Program6 {
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
        // intilizing the sting1
        String word1 = inputValiadtionS(sc);

        // intilizing th estring2
        String word2 = inputValiadtionS(sc);

        int result = isRotated(word1, word2);

        System.out.println(result);

        }

    public static int isRotated(String word1, String word2) {
        // converting string to the character array
        char ch1[] = word1.toCharArray();
        char ch2[] = word2.toCharArray();

        int rotate = 2, count = 0;
        for (int i = 0; i < rotate; i++) {
            char first = ch1[0];// asight the fiest elemnt in the ch1 arry to the first variable
            int j;
            for (j = 0; j < ch1.length - 1; j++) {
                ch1[j] = ch1[j + 1];// asigining the next elemnt to ch1[j]
            }
            ch1[j] = first;// asigning th efirst elent to th elast of the array

        }
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == ch2[i])// chaeck the eq1ual charctes in the bost the arrays and incremts the count
            {
                count++;
            }
        }
        if (count == ch1.length) {
            return 1;
        } else {
            return 0;
        }

    }

}
