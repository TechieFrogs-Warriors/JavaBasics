package StringAssignmentPrograms2;

import java.util.Scanner;

public class LongAndShortPallindrom26 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Eneter pallindrom strings:");
        String str=scan.nextLine();
            String word="",small="",big="";
            String[] words = new String[100];
            int temp = 0, c=0;
            str=str.toLowerCase();
            str=str+" ";
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!=' '){
                    word = word+str.charAt(i);
                 }
                else{
                    words[temp]=word;
                    temp++;
                    word="";
                }
            }
            for(int i=0;i<temp;i++){
                if(Palindrome(words[i])){
                    c++;
                }
                if(c==1){
                    small=big=words[i];
                }
                else{
                    if(small.length()>words[i].length()){
                        small=words[i];
                    }
                    if(big.length()<words[i].length()){
                        big=words[i];
                    }
                }
            }
            if(c==0){
                System.out.println("No palindrome is present in the given string");
            }
            else{
                System.out.println("Smallest Palindrome word: "+small);
                System.out.println("Biggest Palindrome word: "+big);
            }
            scan.close();
    }
    public static boolean Palindrome(String a){
        boolean flag =true;
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-i-1)){
                flag =false;
                break;
            }
        }
        return flag;
    }
}
