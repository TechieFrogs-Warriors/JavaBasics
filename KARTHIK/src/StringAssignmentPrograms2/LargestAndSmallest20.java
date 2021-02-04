package StringAssignmentPrograms2;

import java.util.Scanner;

public class LargestAndSmallest20 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=scan.nextLine();
        Smallest(str);
        scan.close();
    }
    public static void Smallest(String str){
        String Words[]=str.split(" ");
        int BigLen=0;
        int SmallLen=Integer.MAX_VALUE;
        String Small=" ";
        String Big=" ";
        for(int i=0;i<Words.length;i++){
            String word=Words[i];
            int l=word.length();
            if(l>BigLen){
                BigLen=l;
                Big=word;
            }
            if(l<SmallLen){
                SmallLen=l;
                Small=word;
            }
        }
        System.out.println("Smallest Word: "+Small);
        System.out.println("Largest Word: "+Big);

    }
    
}
