package TCS_Programs;

import java.util.Scanner;

public class EnglishWords 
{
    //Method to perform logic as per question
    public static String encryptText(String fWord,String sWord,String tWord)
    {
        //Logic
        //Replacing all vowels by "%"
        fWord = fWord.replaceAll("[aeiouAEIOU]","%");

        //Replacing all consonants by "#"
        sWord = sWord.replaceAll("[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z]", "#");

        //converting lower case to uppercase
        tWord = tWord.toUpperCase();
        return fWord+sWord+tWord;
    }
    public static void main(String[] args) 
    {
        //Reading user input and validating them
        Scanner sc = new Scanner(System.in);
        //Three english words 
        String firstWord = Validation.stringValidation(sc);
        String secondWord = Validation.stringValidation(sc);
        String thirdWord = Validation.stringValidation(sc);

        //Calling Logic method
        System.out.println(encryptText(firstWord, secondWord, thirdWord));
        sc.close();
    }
    
}
