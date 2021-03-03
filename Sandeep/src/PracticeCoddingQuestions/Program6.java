package PracticeCoddingQuestions;

import java.util.*;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// obj for scanner class

        System.out.println("Enter String :: ");
        String scentance = sc.nextLine();

        // code for to find the percentage of uppercase letters, lowercase letters,
        // digits and other special characters(including space)
        int total = scentance.length();

        // intilizing th ecount variables
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int others = 0;
        for (int i = 0; i < scentance.length(); i++) {
            char ch = scentance.charAt(i);// converting string to charectar
            if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                others++;
            }
        }
        // calculating the percentages
        double upperCasePercentage = (upperCase * 100) / total;
        double loweCasePercentage = (lowerCase * 100) / total;
        double digitsPercentage = (digits * 100) / total;
        double otherPercentage = (others * 100) / total;

        // dispalying the percentage
        System.out.println("Upper case letters are :: " + upperCasePercentage + "%");
        System.out.println("Lower case Letters are :: " + loweCasePercentage + "%");
        System.out.println("digits are :: " + digitsPercentage + "%");
        System.out.println("Others are :: " + otherPercentage + "%");

        sc.close();
    }

}
