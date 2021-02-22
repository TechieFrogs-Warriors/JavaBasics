package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

class Pallindrom{
    public void cheak(String str1){
        String arr[]=str1.split(" ");
        boolean flag=false;
        for(int i=0;i<arr.length;i++){ //reverse the string 
            String temp=arr[i] ;
            StringBuffer rev=new StringBuffer(arr[i]);
            rev.reverse();
            String str2=rev.toString();
            if(temp.equals(str2)){// compare the two Strings
                System.out.println("Pallindrom words in the String:"+temp);
            }
            else{
                flag= true;
            }
        }
        if(flag){
            System.out.println("No words are Pallindrom in a given String.");
        }      
    }     
}
public class PallindromInaString1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Text String: ");
        String str1=scan.nextLine();
        Pallindrom obj=new Pallindrom();
        obj.cheak(str1);
        scan.close();
    }
}
