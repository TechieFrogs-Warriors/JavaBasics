package StringAssignmentprograms;

import java.util.Scanner;

public class StringAssignmentprogram1 {
    //Number of Vowels, digits, spaces and Consonants in a Sentence
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String Str=Scan.nextLine();
        
        int vowels=0,consonants=0,digits=0,spaces=0;
        Str=Str.toLowerCase();
        
        for(int i=0;i<Str.length();i++){
            char ch=Str.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels ++;
            }
           
            else if(ch >= 'a' && ch <= 'z'){
                consonants ++;
            }
            
            else if(ch>='0' && ch<='9'){
                digits ++;
            }
            
            else if(ch == ' '){
                spaces ++; 
            }
        }
        
        System.out.println("No.of Vowels in the Sentance: "+vowels);
        System.out.println("No.of Consonenets in the Sentance: "+consonants);
        System.out.println("No.of digits in the Sentance: "+digits);
        System.out.println("No.of spaces in the Sentance: "+spaces);
       
        Scan.close();
    }
}
