package Stringprograms;

public class Strass20 {
    public static void main(String[] args) {
        String sentence="warriors ready to fight";
        String str1="ready";
        String str2="for";
        int result=sentence.indexOf(str1);
        if(result==-1){
            System.out.println(str1 + " present in string");
        }
        else{
            System.out.println(str1 +  " not present in string");
        }
        result=sentence.indexOf(str2);
        if(result==-1){
            System.out.println(str2 + " present in string");
        }
        else{
            System.out.println(str2 + " not present in string");
        }

    }
    
}
