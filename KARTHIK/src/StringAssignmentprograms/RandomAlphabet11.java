package StringAssignmentprograms;

import java.util.Random;
import java.util.Scanner;

public class RandomAlphabet11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Length: ");
        int length=scan.nextInt();

        String Upperalphabet = "ABCDEFG";
        String Loweralphabet = "abcdefg";
        String Numbers = "012345";

        String Alphabetnumeric = Upperalphabet + Loweralphabet + Numbers;

        StringBuilder str = new StringBuilder();

        Random obj = new Random();

        for (int i = 0; i < length; i++) {
            int index = obj.nextInt(Alphabetnumeric.length());

            char ch = Alphabetnumeric.charAt(index);

            str.append(ch);

        }
        System.out.println("Random String is : " + str);
        scan.close();
    }
    
}
