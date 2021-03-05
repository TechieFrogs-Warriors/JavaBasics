package WiproAdvancedPrograms;

import java.util.Scanner;

public class SubString4 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        //input string 
        System.out.println("Enter String:");
        String  S = vallidation(scan);
        System.out.println("Enter small String");
        String P = vallidation(scan);
        //length of String
        int str_Length = S.length();
        //to store the substrings
        String sub_String[] = new String[2*str_Length];
        boolean flag ;
        //find substrings
        for(int i=0;i<str_Length;i++){
            for(int j=i+1;j<str_Length;j++){
                sub_String[i] = S.substring(i, j+1);
            }
        }
        //each substring
        try{
            for(int i=0;i<str_Length;i++){
                flag = is_Present(sub_String[i], P);
                if(flag){
                    System.out.print(sub_String[i]+" ");
                    
                }
            }
        }
        catch(NullPointerException e){
            System.out.println();
        }
        
    }
    //method to find string contains or not
    public static boolean is_Present(String S,String P){
        char ch[] = S.toCharArray();
        String p1 = Character.toString(ch[0]);
        String p2 = Character.toString(ch[1]);
        String p3 = Character.toString(ch[ch.length-1]);
        int i1 = S.indexOf(p1);
        int i2 = S.indexOf(p2);
        int i3 = S.indexOf(p3);
        if(i1==-1 | i2==-1 |  i3==-1){
            return true;
        }
        else{
            return false;
        }
    }
    //int vallidation
    public static String vallidation(Scanner scan){
        String str;
        do{
            while(!scan.hasNext("[A-Za-z]*")){
                System.out.println("Enter String  only: ");
                scan.next();
            }
            str = scan.nextLine();
        }while(str.equals(" "));
        return str;
    }
}
