package StringAssignmentPrograms2;

import java.util.Scanner;

public class worsinText21 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=scan.nextLine();

        int count,maxcount=0;
        str=str.toLowerCase();
        String word[]=str.split(" ");
        String str1=" ";

        for(int i=0;i<word.length;i++){
            count=0;
            for(int j=i+1;j<word.length;j++){
                if(word[i].equals(word[j])){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                str1=word[i];
            }
        }
        if(maxcount==0){
            System.out.println("No word in text file is repeated.");
        }
        else{
            System.out.println("Repeated word in test file is: "+str1);
        }
        scan.close();

    }
    
}
