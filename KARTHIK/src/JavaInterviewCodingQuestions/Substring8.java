package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class Substring8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //taking string as a input
        System.out.println("Enter input string: ");
        String str = scan.nextLine();
        boolean flag;

        //to store the substrings
        String[] sub_String = new String[2*str.length()];

        //logic to get substrings froom string
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                sub_String[i]=str.substring(i, j+1);
            }
        }
        try{//to avoid null pointer exception
            for(int i=0;i<sub_String.length;i++){
                flag = is_Reapet(sub_String[i]);//cheak each substring
                if(flag){
                    System.out.print(sub_String[i]+" ");
                    break;
                }
            }
        }catch(NullPointerException e){
            System.out.println(" ");
        }
        scan.close();
    }
    //method to find repeting words in  each substring
    public static boolean is_Reapet(String str){
        //convert string to char array
        int count =0;
        char ch[] = str.toCharArray();//string to char array
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(ch[i]==ch[j]){//cheaks same elements in the string
                    count++;
                }
            }
        }
        if(count > 0){//duplicate charecters presnt
            return false;
        }
        else{//duplicate charecters not present
            return true;
        }
    }
    //string vallidation
    public static String validation(Scanner scan){
        String str;
        do{
            while(!scan.hasNext("[A-Za-z]*")){
                System.out.println("Enter String only.");
                scan.next();
            }
            str = scan.nextLine();
        }while(str.equals(" "));
        return str;
    }
}
