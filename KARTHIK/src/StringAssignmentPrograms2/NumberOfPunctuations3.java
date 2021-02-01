package StringAssignmentPrograms2;

import java.util.*;

public class NumberOfPunctuations3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str1=scan.nextLine();
        int count = 0;
        for(int i=0;i<str1.length();i++){
        char ch=str1.charAt(i);
            if(ch=='*' || ch=='/' || ch==',' || ch=='.'){
                count++;
            }
        }
        System.out.println("Number Of Punctuations: "+count);
        scan.close();
    }
    
}
