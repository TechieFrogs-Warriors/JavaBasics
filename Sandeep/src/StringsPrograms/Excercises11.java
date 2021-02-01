package StringsPrograms;

import java.util.Random;

public class Excercises11 {
    public static void main(String[] args) {

        String Upperalphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Loweralphabet = "abcdefghijklmnopqrstuvwxyz";
        String Numbers = "0123456789";

        String Alphabetnumeric = Upperalphabet + Loweralphabet + Numbers;

        StringBuilder s1 = new StringBuilder();// create random string builder

        Random obj = new Random();// creating object for random class

        int length = 15;

        for (int i = 0; i < length; i++) {
            int index = obj.nextInt(Alphabetnumeric.length());// generating random index number

            char randamchar = Alphabetnumeric.charAt(index);// get charter specified by index from the string

            s1.append(randamchar);// append the charcter to the stringbuilder

        }
        String randomstring = s1.toString();
        System.out.println("Random String is : " + randomstring);
    }

}
