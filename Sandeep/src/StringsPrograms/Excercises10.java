package StringsPrograms;

import java.util.Random;;

public class Excercises10 {
        public static void main(String[] args) {

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder s1 = new StringBuilder();

        Random obj = new Random();// creating object od Random class

        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = obj.nextInt(alphabet.length());// generate the randam index number

            char randamchar = alphabet.charAt(index);// get chacter spesifed by index from the string

            s1.append(randamchar);
        }
        String randomstring = s1.toString();
        System.out.println("Random String is : " + randomstring);

    }

}
