package StringAssignmentprograms;
import java.util.Random;
import java.util.Scanner;

public class RandomString10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Length: ");
        int length=scan.nextInt();

        String alphabet = "abcdefghi";

        StringBuilder str = new StringBuilder();

        Random obj = new Random();

        for (int i = 0; i < length; i++) {
            int index = obj.nextInt(alphabet.length());

            char ch = alphabet.charAt(index);

            str.append(ch);
        }
        System.out.println("Random String is : " + str);
        scan.close();

    }
    
}
