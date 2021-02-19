package StringAssignmentPrograms2;

import java.util.Scanner;

public class ConvertLowertoUpper11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String Str1=scan.nextLine();
        StringBuffer Str=new StringBuffer(Str1);
        for(int i=0;i<=Str1.length();i++){
            if(Character.isLowerCase(Str1.charAt(i))){
                Str.setCharAt(i, Character.toUpperCase(Str1.charAt(i)));
            }
            else if(Character.isUpperCase(Str1.charAt(i))){
                Str.setCharAt(i, Character.toLowerCase(Str1.charAt(i)));
            }
        }
        System.out.println("Conversation Of the String :"+Str);
        scan.close();
    }
    
}
