package Stringprograms;

public class Strass19 {
    public static void main(String[] args) {
        String sentence="warriors ready to fight";
        String str1="ready";
        String str2="for";
        boolean result=sentence.contains(str1);
        if(result){
            System.out.println(str1 + " present in string");
        }
        else{
            System.out.println(str1 +  " not present in string");
        }
        result=sentence.contains(str2);
        if(result){
            System.out.println(str2 + "present in string");
        }
        else{
            System.out.println(str2 + " not present in string");
        }

    }
    
}
