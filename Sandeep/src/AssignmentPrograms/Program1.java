package AssignmentPrograms;

import java.util.*;

public class Program1 {

    public boolean palindrome(String word) {
        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--) {// reverse of words
            rev = rev + word.charAt(i);
        }
        if (rev.equals(word))// if reversed ord and word is equal then its i true
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Program1 obj1 = new Program1();

        Scanner sc = new Scanner(System.in);

        String str;
        // input validation
        do {
            System.out.println("Enetr String: ");
            while (!sc.hasNext("[A-Za-z]*")) {// String Regular expression
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            str = sc.nextLine();
        } while (str.equals(""));
        System.out.println("Enter  String Is valid " + str);

        str = str.toLowerCase();// converting string to lowercase
        int count = 0;// intilizing the varible
        // to break a sentence in to words based on spaces
        StringTokenizer obj = new StringTokenizer(str, " ");

        while (obj.hasMoreTokens())// cheks for next word or token
        {
            String word = obj.nextToken();// every word is intilized after every iteration
            if (obj1.palindrome(word)) {
                System.out.println(word + "\t");
                count++;
            }
        }
        System.out.println("Count od Plindrome words in a Sentence is : " + count);

    }

}
