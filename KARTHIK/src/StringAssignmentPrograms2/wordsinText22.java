package StringAssignmentPrograms2;

import java.util.Scanner;

public class wordsinText22 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Text String: ");
        String str=scan.nextLine();
        wordText(str);
        scan.close();  
    }
    public static void wordText(String str){
        String[] Words=str.split(" ");
        System.out.println("Number of Words in Text String is: "+Words.length);
    }
    
}
