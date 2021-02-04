package StringAssignmentprograms;

import java.util.Scanner;

public class Lexicograpicalorder2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=scan.nextLine();

        str=str.toUpperCase();

        String word[]=str.split(" ");

        for(int i=0;i<word.length;i++){
            for(int j=i+1;j<word.length;j++){
                if (word[i].compareTo(word[j]) >0){
                    String temp=word[i];
                    word[i]=word[j];
                    word[j]=temp;
                }
            }
        }
        for(int i=0;i<=word.length;i++){
            System.out.println(word[i]);
        }
        scan.close();

    }
}
