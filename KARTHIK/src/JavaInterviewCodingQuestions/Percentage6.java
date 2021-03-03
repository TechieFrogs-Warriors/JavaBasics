package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class Percentage6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //string as input
        System.out.println("Enter String: ");
        String str = vallidation(scan);

        int str_Length = str.length();

        //string to cahr array
        char letter[] = str.toCharArray();

        //logic
        int lowercase_Count =0,uppercase_Count =0,special_Count=0;
        for (int i=0;i<letter.length;i++){
            if(letter[i]>'a' && letter[i]<'z'){//if the charecter is lowercase
                lowercase_Count++;
            }
            else if(letter[i]>'A'&&letter[i]<'Z'){//if the charecter is upper case
                uppercase_Count++;
            }
            //if it is charcter is special  charecters
            else if(letter[i]=='!'|letter[i]=='@'|letter[i]=='#'|letter[i]=='$'|letter[i]=='%'|letter[i]=='^'|letter[i]=='&'|letter[i]=='*'){
                special_Count++;
            }
        }
        System.out.println("Percentage of Lowercase letters: "+(lowercase_Count*100)/str_Length);
        System.out.println("Percentage of Upprrcase letters: "+(uppercase_Count*100)/str_Length);
        System.out.println("Percentage of Special charecters: "+(special_Count*100)/str_Length);
    }
    //String vallidation
    public static String vallidation(Scanner scan){
        String str;
        do{
            while(!scan.hasNext("[A-Za-z&!@#$%^&*(){}' ']*")){
                System.out.println("Enter String only:");
                scan.next();
            }
            str = scan.next();
        }while(str.equals("="));
        return str;
    }
}
