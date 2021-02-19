package StringAssignmentPrograms2;

import java.util.Scanner;

public class DupilicateWord {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String Str=Scan.nextLine();
        String Word[]=Str.split(" ");
        for(int i=0;i<Word.length;i++){
            for(int j=i+1;j<Word.length;j++){
                if(Word [i].equals(Word [j])){
                    System.out.println(Word[j]+" ");
                    break;
                }
            }
        }
        Scan.close();
    }
    
}
