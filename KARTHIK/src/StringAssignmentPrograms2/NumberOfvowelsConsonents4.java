package StringAssignmentPrograms2;

import java.util.Scanner;

public class NumberOfvowelsConsonents4 {
    public static void main(String[] args) {
        Scanner scan=new  Scanner(System.in);
        System.out.println("Enter String: ");
        String str1=scan.nextLine();
        int vowels = 0,consonants=0;
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                consonants++;
            }
        }
        System.out.println("Number Of vowels:"+vowels);
        System.out.println("Number of Consonents: "+consonants);
        scan.close();
    }  
    
}
