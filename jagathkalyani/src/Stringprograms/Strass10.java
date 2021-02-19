package Stringprograms;

import java.util.Random;

public class Strass10 {
    public static void main(String[] args) {
        String alphabet="abcdefghijk";
        StringBuilder str =new StringBuilder();
        Random random=new Random();
        int length=7;
        for(int i=0;i<length;i++){
            int index=random.nextInt(alphabet.length());
            char randomchar=alphabet.charAt(index);
            str.append(randomchar);
        }
        String randomstring=str.toString();
        System.out.println("RANDOM STRING IS : " + randomstring);


    }
    
}
