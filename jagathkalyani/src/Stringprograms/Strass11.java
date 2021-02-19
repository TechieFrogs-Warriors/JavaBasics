package Stringprograms;

import java.util.Random;

public class Strass11 {
    public static void main(String[] args) {
        String alphanum="abcdefghijkAAFFFGGG124455";
        StringBuilder str =new StringBuilder();
        Random random=new Random();
        int length=7;
        for(int i=0;i<length;i++){
            int index=random.nextInt(alphanum.length());
            char randomchar=alphanum.charAt(index);
            str.append(randomchar);
        }
        String randomstring=str.toString();
        System.out.println("RANDOM STRING IS : " + randomstring);
    }

    
}
