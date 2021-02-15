package Practice;

import java.util.*;

public class practicea {
    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s1;
        do {
            System.out.println("Enter String : ");
            while (!sc.hasNext("[A-Za-z]*")) {
                System.out.println("This is not a string Enter String:");
                sc.next();
            }
            s1 = sc.nextLine();

        } while (s1 == "");

        System.out.println("Sub sets of given string --");
        for (int i = 0; i < s1.length(); i++)// loop for the postion of elemnts
        {
            for (int j = i + 1; j <= s1.length(); j++)// loop for the next postion
            {
                System.out.println(s1.substring(i, j));// logic for obtaining sub sets
            }
        }
        sc.close();
    }

}
