package WiproPrograms;

import java.util.*;

public class Program1a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=vallidation(scan);
        //string buffer to store string
        StringBuffer str1=new StringBuffer(str);
        

        //converting lower to upper and viceversa
        for(int i=0;i<str.length();i++){
            //convert lower to upper case
            if(Character.isLowerCase(str.charAt(i))){
                str1.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            //convert high to lower case
            else if(Character.isUpperCase(str.charAt(i))){
                str1.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println(str1);
        scan.close();

    }
    //string vallidation
    public static String vallidation(Scanner scan){
        String str;
        do{
            System.out.println("Enter String: ");
            while(!scan.hasNext("[a-z&A-z& ]*")){
                System.out.println("Please Enter String only: ");
                scan.next();
            }
            str=scan.nextLine();
        }
        while(str.equals(""));
        return str;
    }
}
