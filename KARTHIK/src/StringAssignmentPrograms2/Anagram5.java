package StringAssignmentPrograms2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter String1: ");
        String str1=scan.nextLine();

        System.out.println("Enter String2: ");
        String str2=scan.nextLine();

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean Eq=Arrays.equals(a, b);

        if(Eq){
            System.out.println("Both String are Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
        scan.close();
    }
    
}
